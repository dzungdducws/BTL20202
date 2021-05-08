package data;

import java.time.LocalDate;

public class CanBoGiangDay extends CanBo {

	public CanBoGiangDay(String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		super(fullName, ID, birthDay, type, workProgress);
		if (getWorkProgress() > 1.2 * constant.Constant.GIO_GIANG_DAY_TIEU_CHUAN) {
			setBonus(true);
		}
	}

	@Override
	public String toString() {
		return "CanBoGiangDay [getFullName()=" + getFullName() + ", getID()=" + getID() + ", getBirthDay()="
				+ getBirthDay() + ", getType()=" + getType() + ", getWorkProgress()=" + getWorkProgress()
				+ ", isBonus()=" + isBonus() + "]";
	}
}
