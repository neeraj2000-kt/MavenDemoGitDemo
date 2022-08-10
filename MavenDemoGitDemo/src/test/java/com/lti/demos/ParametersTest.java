package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametersTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@ParameterizedTest
	@ValueSource(ints = {8,10,30,14,20})
	public void testIntAryParam(int args) {
		System.out.println(" arg :"+args);
		Assertions.assertTrue(args%2==0);
	}
	@DisplayName(" should pass test cases if all parma are not null")
	@ParameterizedTest
	@ValueSource(strings = {"Hello","World"})
	public void testParams(String msg)
	{
		Assertions.assertNotNull(msg);
	}
	@Test
	public void testLambdaList()
	{
		Integer[] intAry = {10,20,5,25};
		List<Integer> inList = Arrays.asList(intAry);
		Assertions.assertAll(
				()->assertEquals(10,inList.get(0)),
				()->assertEquals(24,inList.get(1)),
				()->assertEquals(50,inList.get(1)),
				()->assertEquals(25,inList.get(1))
				);
		
	}
	@RepeatedTest(value=3,name="Repeat for 3 times")
	public void repeatTest()
	{
		
	}
}

