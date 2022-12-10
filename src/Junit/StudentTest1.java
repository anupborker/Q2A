package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest1 {

	@Test
	void test() {
	//	fail("Not yet implemented");
		StudentClass s = new StudentClass();
		s.setName("ANup");
		s.setRollno(503);
		assertEquals(s.getName(),"ANup");
	}

}
