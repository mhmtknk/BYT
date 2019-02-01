import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class SubscriberTest {
	
	Subscriber c1;
	
	@Before
	public void initialize() {
		c1 = new Subscriber(1, "log1", "pass1", "name1", "sur1", new Date(), "mail", "1-1-1", "inf1", "infoshopping1");
	}
	
	@Test
	public void testConstructor() {
		assertEquals(c1.getBithDate(), null);
	}
	
	@Test
	public void testGettersAndSetters() {
		c1.setShoppingInfo("info1");
		assertEquals(c1.getShoppingInfo(), "info1");
	}
}
