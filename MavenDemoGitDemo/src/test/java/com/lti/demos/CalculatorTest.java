package com.lti.demos;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demo.Calculator;

class CalculatorTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	Calculator c = new Calculator();
	@Disabled
	@Test
	public void testCalcSayHello()
	{
		Assertions.assertEquals("Hello world",c.sayHello());
	}
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
	@Test
	public void testAssertNulls()
	{
		
	}
	@Test
	public void testAssertFalse()
	{
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is smaller than 20");
		Assertions.assertNotEquals("Hello","Hello");
	}
	@Test
	public void testArrays()
	{
		ArrayList<Integer> ar = new ArrayList<>();
		Assertions.assertEquals(0,ar.size());
		Assertions.assertTrue(ar.isEmpty());
		
		ar.add(100);
		ar.add(200);
		
		Assertions.assertEquals(2,ar.size());
	}

}
