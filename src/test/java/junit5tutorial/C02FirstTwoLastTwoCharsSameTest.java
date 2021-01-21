//package junit5tutorial;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//class C02FirstTwoLastTwoCharsSameTest {
//
//	C02FirstTwoLastTwoCharsSame strToModify;
//
//	@BeforeEach
//	void setUp()  {
//		strToModify=new C02FirstTwoLastTwoCharsSame();
//		System.out.println("Before Each new object");
//	}
//
//	@AfterEach
//	void tearDown()  {
//		strToModify=null;
//		System.out.println("After Each null");
//	}
//
//	@ParameterizedTest
//    @CsvSource(value = {"true , AB" , "true, ABAB", "false, ABCD", "false, A" , "false, ''"})
//	void deleteAFirstTwo(Boolean rs, String actual)
//	{
//		assertEquals(rs, strToModify.checkIfFirstTwoLastTwoCharsSame(actual));
//	}
//	
//	
//	@ParameterizedTest
//    @ValueSource(strings = {"ABAB , AB"})
//	void deleteAFirstTwo(String str)
//	{
//		assertTrue(strToModify.checkIfFirstTwoLastTwoCharsSame(str));
//	}
//	
//	@ParameterizedTest
//    @ValueSource(strings = {"ABAB , AB"})
//	void deleteAFirstTwo(String str)
//	{
//		assertFalse(strToModify.checkIfFirstTwoLastTwoCharsSame(str));
//	}
//
//
//}
