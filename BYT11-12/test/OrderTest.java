import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {
	
	Order r1;
	Order r2;
	Order r3;
	
	@Before
	public void initialize(){
		r1 = new Order(1, new Date(1516297772816L));
		r2 = new Order(2, new Date(1516297000816L));
		r3 = new Order(1, new Date(1516207702806L));
	}
	
	@Test
	public void testConstructor() {
		assertEquals(r3.getOrderId(), 0);
	}
	
	@Test
	public void testSettersAndGetters() {
		//OrderId getter and setter
		r1.setOrderId(8);
		assertEquals(r1.getOrderId(), 8);
		
		r1.setOrderId(2);
		assertEquals(r1.getOrderId(), 8);
		
		//Date getter and setter
		r2.setDate(new Date(1516297772816L));
		assertEquals(r1.getDate(), new Date(1516297772816L));
	}

}
