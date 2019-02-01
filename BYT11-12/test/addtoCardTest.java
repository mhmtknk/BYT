import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class addtoCardTest {

	AddtoCard sh1;
	AddtoCard sh2;
	AddtoCard sh3;

	@Before
	public void initialize() {
		sh1 = new AddtoCard(1, new Date(), 25.17f, 15);
		sh2 = new AddtoCard(2, new Date(), -0.17f, 0);
		sh3 = new AddtoCard(1, new Date(), 777.4f, -50);
	}

	@Test
	public void checkConstructor() {
		assertEquals(sh3.getCardId(), 0);
		assertEquals(sh2.getBalance(), 0, 0f);
		assertEquals(sh3.getDiscountPercentage(), 0);
	}

	@Test
	public void checkSettersAndGetters() {
		// CardID
		sh1.setCardID(7);
		assertEquals(sh1.getCardId(), 7);
		sh1.setCardID(2);
		assertEquals(sh1.getCardId(), 7);

		// ValidDate
		sh2.setValidDate(new Date(1516297000816L));
		assertEquals(sh2.getValidDate(), new Date(1516297000816L));

		// Balance
		sh3.setBalance(7.0f);
		assertEquals(sh3.getBalance(), 7.0f, 0);
		sh3.setBalance(-7.0f);
		assertEquals(sh3.getBalance(), 7.0f, 0);

		// Discount
		sh1.setDiscountPercentage(11);
		assertEquals(sh1.getDiscountPercentage(), 11);
		sh1.setDiscountPercentage(-11);
		assertEquals(sh1.getDiscountPercentage(), 11);

	}

}
