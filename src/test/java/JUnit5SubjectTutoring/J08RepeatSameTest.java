package JUnit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

class J08RepeatSameTest {

	@RepeatedTest(10)
	void testExactAdd() {
		System.out.println("test executed");
		int a=1;
		assertEquals(2*a+1, Math.addExact(a, a+1));
		a++;
	}
}
