import java.util.Date;

public class Subscriber extends Users {

	public String shoppingInfo;

	public Subscriber(int userID, String loginName, String password, String name, String surname, Date birthDarte,
			String eMail, String phoneNumber, String creditCardInfo, String shoppingInfo) {
		super(userID, loginName, password, name, surname, birthDarte, eMail, phoneNumber, creditCardInfo);
		this.shoppingInfo = shoppingInfo;
	}

	public String getShoppingInfo() {
		return shoppingInfo;
	}

	public void setShoppingInfo(String shoppingInfo) {
		this.shoppingInfo = shoppingInfo;
	}

	public boolean MakeAnOrder() {
		return true;
	}

	public boolean ManageAccount() {
		return true;
	}

	public boolean LogInLogOut() {
		return true;
	}

	public boolean checkBalance(AddtoCard c) {
		return true;
	}

	public boolean useCard(AddtoCard c) {
		return true;
	}

}
