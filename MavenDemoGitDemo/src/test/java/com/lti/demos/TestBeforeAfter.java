package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class TestBeforeAfter {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	Calculator c = new Calculator();
	@BeforeAll
	@BeforeEach
	@Test
	public void testAddNos()
	{
		Assertions.assertEquals(300,c.addNos(200, 100));
	}
	@Test
	public void testSubNos()
	{
		Assertions.assertEquals(200,c.subNos(400,200));
	}

}
