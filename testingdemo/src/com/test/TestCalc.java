package com.test;

import org.junit.Test;

import com.demo.Calc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

public class TestCalc {
	static Calc calc ;
	//@Before
	@BeforeClass
	public static void start() {
		calc = new Calc();
	}
	
	@Test
	@Ignore
	public void testTwoPostiveNumbers() {
		
		int result = calc.add(10, 20);
		Assert.assertEquals(30, result);
	}
	//@Test(expected = java.io.FileNotFoundException.class)
	@Test(timeout = 1000)
	//@Test
	public void testTwoNegativeNumbers() {
		
		int result = calc.add(-10, -20);
		Assert.assertEquals(-30, result);
	}
}
