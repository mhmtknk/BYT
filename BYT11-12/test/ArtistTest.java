import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class ArtistTest {

	Artist e1;
	Artist e2;

	@Before
	public void initialize() {
		e1 = new Artist(1, "log1", "pass1", "Artist name1", "Artist sur1", new Date(1516297772816L), "mail", "1-1-1",
				"inf1", 110.50f, 40);
		e2 = new Artist(2, "log2", "pas2", "Artist name2", " Artist sur2", new Date(), "mail2", "1-1-122", "inf2",
				-110.50f, -40);
	}

	@Test
	public void testConstructor() {
		assertEquals(e2.getRevenue(), 0.0f, 0);
		assertEquals(e2.getWorkingHours(), 0);
		assertEquals(e2.getBithDate(), null);
	}

	@Test
	public void testGetterandSetter() {
		// Revenue
		e1.setRevenue(-10);
		assertEquals(e1.getRevenue(), 110.50f, 0);
		// WorkingHours
		e1.setWorkingHours(-7);
		assertEquals(e1.getWorkingHours(), 40);
		// BirthDate
		e1.setBirthDate(new Date());
		assertEquals(e1.getBithDate(), new Date(1516297772816L));

	}

}
