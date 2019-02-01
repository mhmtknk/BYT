import java.util.ArrayList;
import java.util.Date;

public class Order {
	
	private static ArrayList<Integer> IDs = new ArrayList<>();
	private int orderID;
	public Date date;
	
	public Order(int orderID, Date date) {
		if(!IDs.contains(orderID)) {
			this.orderID = orderID;
			IDs.add(orderID);
		}
		this.date = date;
	}
	
	public int getOrderId() {
		return orderID;
	}
	
	public void setOrderId(int orderID) {
		if(!IDs.contains(orderID)) {
			this.orderID = orderID;
			IDs.add(orderID);
		} 
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public boolean placeOrder() {return false;}
	

}
