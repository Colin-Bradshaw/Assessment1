package LambdasAndStreams.Assessment1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LambdasAndStreamsTest {
	
	@Test
	void stringSortHelperTest() {
		assertEquals(LambdasAndStreams.stringSortHelper("se", "ee"), 0);
		assertEquals(LambdasAndStreams.stringSortHelper("se", "jj"), -1);
		assertEquals(LambdasAndStreams.stringSortHelper("ss", "ee"), 1);
		assertEquals(LambdasAndStreams.stringSortHelper("ss", "jj"), 0);
	}

}
