package JUnit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class J01Assertions {

	@Test
	void test() {
		
		fail("Not yet implemented");
	}
	
	@Test
	void testLength() {
		
		assertEquals("ABCD".length(), 4);
	}

}
