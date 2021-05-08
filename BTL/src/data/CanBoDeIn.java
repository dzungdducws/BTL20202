package data;

public class CanBoDeIn {
	private String fullName;
	private String ID;
	private String birthDay;
	private String type;
	private int workProgress;
	private String bonus ;
	
	public CanBoDeIn(String fullName, String ID, String birthDay, String type, int workProgress, String bonus) {

		this.fullName = fullName;
		this.ID = ID;
		this.birthDay = birthDay;
		this.type = type;
		this.workProgress = workProgress;
		this.bonus = bonus;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getBirthDay() {
		return birthDay;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWorkProgress() {
		return workProgress;
	}
	
	public String getBonus() {
		return bonus;
	}

	@Override
	public String toString() {
		return "CanBoDeIn [fullName=" + fullName + ", ID=" + ID + ", birthDay=" + birthDay + ", type=" + type
				+ ", workProgress=" + workProgress + ", bonus=" + bonus + "]";
	}
	
}
