package DateTime.Assessment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MondaysInMonthTest {
	MondaysInMonth mon = new MondaysInMonth();
	// August2021
	Integer[] Aug2021 = {2021, 8, 2, 2021, 8, 9, 2021, 8, 16, 2021, 8, 23, 2021, 8, 30};
	// February2021
	Integer[] Feb2021 = {2021, 2, 1, 2021, 2, 8, 2021, 2, 15, 2021, 2, 22};
			
	@Test
	void isMondayTest() {
		assertArrayEquals(Aug2021, mon.isMonday(2021, 8, 1));
		assertArrayEquals(Feb2021, mon.isMonday(2021, 2, 1));
	}

}
