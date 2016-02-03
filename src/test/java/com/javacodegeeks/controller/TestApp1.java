package com.javacodegeeks.controller;
import junit.framework.Assert;
import org.junit.Test;

public class TestApp1 {
	@Test
	public void testPrintHelloWorld2() {
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
	}
	
	@Test
	public void testPrintHelloWorld3() {
		App app = new App();
		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");
	}

}