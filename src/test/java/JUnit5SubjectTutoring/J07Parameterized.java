package JUnit5SubjectTutoring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class J07Parameterized {

	//Create a test method to test if the length() working as expected for
		//ABCD, ABC, A, "", abcdefg
		@Test//not recommended
		void testLength1() {
			
			assertTrue("ABCD".length()>0);
			assertTrue("ABC".length()>0);
			assertTrue("A".length()>0);
			assertTrue("".length()>=0);
			assertTrue("abcdefg".length()>0);
			
		}
		
		@ParameterizedTest
		@ValueSource(strings = {"ABCD", "ABC", "A", "", "abcdefg"})
		void testLength2(String str) {
			
			assertTrue(str.length()>=0);
		}
		
		@Test
		void upperCaseTest() {
			String str1="Ali Can";
			String str2="ali can";
			String str3="ali";
			String str4="123";
			
			assertEquals("ALI CAN", str1.toUpperCase());
			assertEquals("ALI CAN", str2.toUpperCase());
			assertEquals("ALI", str3.toUpperCase());
			assertEquals("123", str4.toUpperCase());
			
		}
		
		@ParameterizedTest
		@CsvSource(value= {"ALI CAN, Ali Can","ALI CAN, ali can", "ALI, ali", "123, 123"})
		void upperCaseTest2(String s1, String s2)
		{
			assertEquals(s1,s2.toUpperCase());
		}
		

}
