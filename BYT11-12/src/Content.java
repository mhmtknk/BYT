import java.util.ArrayList;
import java.util.Date;

public class Content {

	private static ArrayList<Integer> IDs = new ArrayList<>();
	private int contentID;
	public Genre genre;
	public String status;
	public float price;
	public Date date;

	public Content(int contentID, Genre genre, String status, float price, Date date) {
		if (!IDs.contains(contentID)) {
			this.contentID = contentID;
			IDs.add(contentID);
		}
		this.genre = genre;
		this.status = status;
		if (price >= 0)
			this.price = price;
		this.date = date;
	}

	public int getContentID() {
		return contentID;
	}

	public void setContentID(int productID) {
		if (!IDs.contains(productID)) {
			this.contentID = productID;
			IDs.add(productID);
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		if (price >= 0)
			this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
