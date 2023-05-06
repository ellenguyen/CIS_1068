package southie;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SouthieStylesTest {
	
	@Test
	void testUpper() {
		assertTrue(SouthieStyles.upper('A'));
		assertTrue(SouthieStyles.upper('E'));
		assertTrue(SouthieStyles.upper('I'));
		assertTrue(SouthieStyles.upper('O'));
		assertTrue(SouthieStyles.upper('U'));
		assertFalse(SouthieStyles.upper('a'));
		assertFalse(SouthieStyles.upper('e'));
		assertFalse(SouthieStyles.upper('i'));
		assertFalse(SouthieStyles.upper('o'));
		assertFalse(SouthieStyles.upper('u'));
		
	}
	@Test
	void testIsVowel() {
		assertTrue(SouthieStyles.is_vowel('a'));
		assertTrue(SouthieStyles.is_vowel('e'));
		assertTrue(SouthieStyles.is_vowel('i'));
		assertTrue(SouthieStyles.is_vowel('o'));
		assertTrue(SouthieStyles.is_vowel('u'));
		assertFalse(SouthieStyles.is_vowel('q'));
		assertFalse(SouthieStyles.is_vowel('w'));
		assertFalse(SouthieStyles.is_vowel('r'));
		assertFalse(SouthieStyles.is_vowel('t'));
		assertFalse(SouthieStyles.is_vowel('y'));
	}
	
	@Test
	void testRule1() {
		assertEquals("hahboh", SouthieStyles.Rule1("harbor"));
		assertEquals("cah", SouthieStyles.Rule1("car"));
		assertEquals("phrase", SouthieStyles.Rule1("phrase"));
		assertEquals("writeh", SouthieStyles.Rule1("writer"));
		assertEquals("wateh", SouthieStyles.Rule1("water"));
	}
	
	@Test
	void testRule2() {
		assertEquals("tunar", SouthieStyles.Rule2("tuna"));
		assertEquals("cubar", SouthieStyles.Rule2("cuba"));
		assertEquals("idear", SouthieStyles.Rule2("idea"));
		assertEquals("a tunar", SouthieStyles.Rule2("a tuna"));
		assertEquals("a car", SouthieStyles.Rule2("a car"));
	}
	
	@Test
	void testRule3() {
		assertEquals("wicked", SouthieStyles.Rule3("very"));
	}
	
	@Test
	void testException1() {
		assertEquals("deeyah", SouthieStyles.Exception1("deer"));
		assertEquals("veneeyah", SouthieStyles.Exception1("veneer"));
		assertEquals("veneers", SouthieStyles.Exception1("veneers"));
	}
	
	@Test
	void testException2() {
		assertEquals("doowah", SouthieStyles.Exception2("door"));
		assertEquals("doors", SouthieStyles.Exception2("doors"));
	}
	
	@Test
	void testConversion() {
		assertEquals("doohs", SouthieStyles.conversion("doors"));
		assertEquals("Uppeh", SouthieStyles.conversion("Upper"));
		assertEquals("wicked hahd", SouthieStyles.conversion("wicked hard"));
		assertEquals("SWeeteh", SouthieStyles.conversion("SWeeter"));
		assertEquals("blusheh", SouthieStyles.conversion("blusher"));
	}

}
