package DateTime.Assessment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthOfMonthsTest {
	LengthOfMonths lm =  new LengthOfMonths();
	int[] ans2021 = {1, 31, 2, 28, 3, 31, 4, 30, 5, 31, 6, 30, 7, 31, 8, 31, 9, 30, 10, 31, 11, 30, 12, 31};
	// 2020 was a leap year
	int[] ans2020 = {1, 31, 2, 29, 3, 31, 4, 30, 5, 31, 6, 30, 7, 31, 8, 31, 9, 30, 10, 31, 11, 30, 12, 31};
	
	
	@Test
	void daysInMonthTest() {
		//fail("Not yet implemented");
		assertArrayEquals(ans2021, lm.daysInMonths(2021));
		assertArrayEquals(ans2020, lm.daysInMonths(2020));
	}

}
