package org.sayem.testng.chapter5.dependency.method;

import org.testng.annotations.Test;

public class SimpleDependencyTest {
	@Test(dependsOnMethods={"testTwo"})
	public void testOne(){
		System.out.println("Test method one");
	}
	
	@Test
	public void testTwo(){
		System.out.println("Test method two");
	}	
}
