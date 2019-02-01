import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ContentTest {

	Content p1;
	Content p2;
	Content p3;

	@Before
	public void initialize() {
		p1 = new Content(1, new Genre(1, "Horror"), "content bought ", 23.65f, new Date(1516297772816L));
		p2 = new Content(2, new Genre(2, "Action"), "content bought ", -3.5f, new Date(1516297772777L));
		p3 = new Content(1, new Genre(2, "Action"), "content bought ", 0.0f, new Date(1516297772000L));
	}

	@Test
	public void checkConstructor() {
		assertEquals("Shoudl be defaut value(0.0f), since there was an attempt " + "to assign negative price",
				p2.getPrice(), 0.0f, 0);

		assertEquals("Shoudl be defaut value(0), since there was an attempt " + "to assign already existing id",
				p3.getContentID(), 0);
	}

	@Test
	public void checkSettersAndGetters() {

		// ContentID getter and setter
		p1.setContentID(10);
		assertEquals(p1.getContentID(), 10);

		assertEquals(p2.getContentID(), 2);
		p2.setContentID(10);
		assertEquals("Initiall id value was 2 and should not change, since id 10 is already exists", p2.getContentID(),
				2);

		// status getter and setter
		p3.setStatus("new status");
		assertEquals(p3.getStatus(), "new status");

		// Price getter and setter
		p1.setPrice(10.0f);
		assertEquals(p1.getPrice(), 10.0f, 0);

		p1.setPrice(-1.0f);
		assertEquals(
				"Price was 10.0f and should stay like this, since there was an attemp to assign" + "negative value",
				p1.getPrice(), 10.0f, 0);

		// Date setter and getter
		p1.setDate(new Date(151629777111L));
		assertEquals(p1.getDate(), new Date(151629777111L));

	}

}
