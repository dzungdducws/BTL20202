package data;

import java.time.LocalDate;

public class CanBo {
	private String fullName;
	private String ID;
	private LocalDate birthday;
	private int type;
	private int workProgress;
	private boolean bonus = false;
	
	public CanBo(String fullName, String ID, LocalDate birthDay, int type, int workProgress) {
		this.fullName = fullName;
		this.ID = ID;
		this.birthday = birthDay;
		this.type = type;
		this.workProgress = workProgress;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public LocalDate getBirthDay() {
		return birthday;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthday = birthDay;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getWorkProgress() {
		return workProgress;
	}

	public void setWorkProgress(int workProgress) {
		this.workProgress = workProgress;
	}

	public boolean isBonus() {
		return bonus;
	}
	
	public void setBonus(boolean bonus) {
		this.bonus = bonus;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + (bonus ? 1231 : 1237);
		result = prime * result + ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result + type;
		result = prime * result + workProgress;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CanBo other = (CanBo) obj;
		if (ID == null) {
			if (other.ID != null)
				return false;
		} else if (!ID.equals(other.ID))
			return false;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (bonus != other.bonus)
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (type != other.type)
			return false;
		if (workProgress != other.workProgress)
			return false;
		return true;
	}

	
}
