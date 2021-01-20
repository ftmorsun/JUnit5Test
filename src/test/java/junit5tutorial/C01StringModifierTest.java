package junit5tutorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class C01StringModifierTest {
	
	C01StringModifier strToModify;

	@BeforeEach
	void setUp()  {
		strToModify=new C01StringModifier();
		System.out.println("Before Each new object");
	}

	@AfterEach
	void tearDown()  {
		strToModify=null;
		System.out.println("After Each null");
	}
	@ParameterizedTest
	@CsvSource(value = {"BC ,AABC" , "BC, ABC", "BCD, BCD", "B, B" , " '', A"})
	void deleteAFirstTwo(String expected, String actual)
	{
		assertEquals(expected, strToModify. deleteAFirstTwo(actual));
	}
}
