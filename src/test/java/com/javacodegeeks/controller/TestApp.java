package com.javacodegeeks.controller;
import junit.framework.Assert;
import org.junit.Test;

public class TestApp {

	@Test
	public void testPrintHelloWorld() {

		Assert.assertEquals(App.getHelloWorld(), "Hello World");

	}

}