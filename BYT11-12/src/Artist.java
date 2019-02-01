import java.util.Date;

public class Artist extends Users {

	public float revenue;
	public int workingHours;

	public Artist(int userID, String loginName, String password, String name, String surname, Date birthDarte,
			String eMail, String phoneNumber, String creditCardInfo, float revenue, int workingHours) {
		super(userID, loginName, password, name, surname, birthDarte, eMail, phoneNumber, creditCardInfo);
		if (revenue >= 0)
			this.revenue = revenue;
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}

	public float getRevenue() {
		return revenue;
	}

	public void setRevenue(float salary) {
		if (salary >= 0)
			this.revenue = salary;
	}

	public int getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(int workingHours) {
		if (workingHours >= 0)
			this.workingHours = workingHours;
	}

}
