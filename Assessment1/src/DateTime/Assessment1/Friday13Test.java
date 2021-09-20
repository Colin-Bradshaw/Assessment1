package DateTime.Assessment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Friday13Test {
	Friday13 fr = new Friday13();
	
	@Test
	void isThe13thTest() {
		assertTrue(fr.isItThe13th(2021, 8, 13));
		assertFalse(fr.isItThe13th(2020, 8, 13));
		assertFalse(fr.isItThe13th(2021, 8, 20));
	}

}
