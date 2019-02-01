import java.util.ArrayList;
import java.util.Date;

public class AddtoCard {
	
	private static ArrayList<Integer> IDs = new ArrayList<>();
	private int cardID;
	public Date validDate;
	public float balance;
	public int discountPercentage;
	
	public AddtoCard(int cardID, Date validDate, float balance, int discountPercentage) {
		if(!IDs.contains(cardID)) {
			this.cardID = cardID;
			IDs.add(cardID);
			}
		this.validDate = validDate;
		if(balance >= 0) this.balance = balance;
		if(discountPercentage >= 0) this.discountPercentage = discountPercentage;
	}
	
	public int getCardId() {
		return cardID;
	}
	
	public void setCardID(int cardID) {
		if(!IDs.contains(cardID)) {
			this.cardID = cardID;
			IDs.add(cardID);
		}
	}
	
	public Date getValidDate() {
		return validDate;
	}
	
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float balance) {
		if(balance >= 0) this.balance = balance;
	}
	
	public int getDiscountPercentage() {
		return discountPercentage;
	}
	
	public void setDiscountPercentage(int discountPercentage) {
		if(discountPercentage >= 0) this.discountPercentage = discountPercentage;
	}

}
