import java.util.ArrayList;
import java.util.Date;

public abstract class Users {
	
	private static ArrayList<Integer> IDs = new ArrayList<>();
	private static ArrayList<String> passwords = new ArrayList<>();
	private static ArrayList<String> logins = new ArrayList<>();
	private int userID;
	public String loginName;
	private String password;
	public String name;
	public String surname;
	public Date birthDarte;
	public String eMail;
	public String phoneNumber;
	public String creditCardInfo;
	
	public Users(int userID, String loginName, String password, String name, String surname, 
			Date birthDarte,String eMail, String phoneNumber, String creditCardInfo) {
		if(!IDs.contains(userID)) {
			this.userID = userID;
			IDs.add(userID);
		}
		if(!logins.contains(loginName) && loginName.length() > 0) {
			this.loginName = loginName;
			logins.add(loginName);
		}
		if(!passwords.contains(password) && password.length() > 0) {
			this.password = password;
			passwords.add(password);
		}
		this.name = name;
		this.surname = surname;
		if(birthDarte != null) {
			if(new Date().after(birthDarte)) this.birthDarte = birthDarte;
		}
		this.eMail = eMail;
		if(phoneNumber.length() > 0)this.phoneNumber = phoneNumber;
		if(creditCardInfo.length() > 0) this.creditCardInfo = creditCardInfo;
	}
	
	public Users(int userID, String loginName, String password, String name, 
			String eMail, String phoneNumber) {
		this(userID, loginName, password, name, "", null, eMail, phoneNumber,"");
	}
	
	
	public int getUserID() {
		return userID;
	}
	
	public void setuserID(int userID) {
		if(!IDs.contains(userID)) {
			this.userID = userID;
			IDs.add(userID);
		}
	}
	
	public String getLogin() {
		return loginName;
	}
	
	public void setLogin(String loginName) {
		if(!logins.contains(loginName) && loginName.length() > 0) {
			this.loginName = loginName;
			logins.add(loginName);
		}
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		if(!passwords.contains(password) && password.length() > 0) {
			this.password = password;
			passwords.add(password);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public Date getBithDate() {
		return birthDarte;
	}
	
	public void setBirthDate(Date birthDarte) {
		if(new Date().after(birthDarte)) this.birthDarte = birthDarte;
	}
	
	public String getEmail() {
		return eMail;
	} 
	
	public void setEmail(String eMail) {
		this.eMail = eMail;
	}
	
	public String getPhone() {
		return phoneNumber;
	}
	
	public void setPhone(String phoneNumber) {
		if(phoneNumber.length() > 0)this.phoneNumber = phoneNumber;
	}
	
	public String getCardInfo() {
		return creditCardInfo;
	}
	
	public void setCardInfo(String creditCardInfo ) {
		if(creditCardInfo.length() > 0) this.creditCardInfo = creditCardInfo;
	}
	
	public boolean restorePassword() {return false;}
	public boolean login() {return false;}
}
