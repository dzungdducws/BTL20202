package data;

import java.time.LocalDate;

public class CanBoPhucVu extends CanBo {

	public CanBoPhucVu(String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		super(fullName, ID, birthDay, type, workProgress);
		if (getWorkProgress() > 1.5 * constant.Constant.GIO_PHUC_VU_TIEU_CHUAN) {
			setBonus(true);
		}
	}
	
	@Override
	public String toString() {
		return "CanBoPhucVu [getFullName()=" + getFullName() + ", getID()=" + getID() + ", getBirthDay()="
				+ getBirthDay() + ", getType()=" + getType() + ", getWorkProgress()=" + getWorkProgress()
				+ ", isBonus()=" + isBonus() + "]";
	}
}
