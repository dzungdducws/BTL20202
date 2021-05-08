package data;

import java.time.LocalDate;

public class CanBoNghienCuu extends CanBo {

	public CanBoNghienCuu(String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		super(fullName, ID, birthDay, type, workProgress);
		if (getWorkProgress() > constant.Constant.SO_BAI_NGHIEN_CUU_TIEU_CHUAN + 2) {
			setBonus(true);
		}
	}
	
	@Override
	public String toString() {
		return "CanBoNghienCuu [getFullName()=" + getFullName() + ", getID()=" + getID() + ", getBirthDay()="
				+ getBirthDay() + ", getType()=" + getType() + ", getWorkProgress()=" + getWorkProgress()
				+ ", isBonus()=" + isBonus() + "]";
	}

}
