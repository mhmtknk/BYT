import java.util.Date;

public class Payment extends Order {
    private int totalCost;

    public Payment(int orderID, Date date){
    	super(orderID, date);
    }

    public int calculateItemcost(int itemQuantity, int itemPrice){
        return itemPrice * itemQuantity;}

    public int calculateTotalcost(int itemCost){
        return totalCost = totalCost + itemCost;
    }


    public int calculateBalance(int clickedValue, int totalCost){
        return this.totalCost = totalCost - clickedValue;}

    public int getTotalcost(){
        return this.totalCost;
    }    

    public void setTotalcost(int totalcost) {
        this.totalCost = totalcost;
    }
    
    public boolean PaymentPayPal(Order o) {return true;}
    public boolean PaymentBankCard(Order o) {return true;}
}     