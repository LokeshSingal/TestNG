package org.sayem.testng.chapter5.DependencyProject.method;

import org.testng.annotations.Test;

public class InheritedTest extends SimpleDependencyTest{
	@Test(dependsOnMethods={"testOne"})
	public void testThree(){
		System.out.println("Test three method in Inherited test");
	}
	
	@Test
	public void testFour(){
		System.out.println("Test four method in Inherited test");
	}

}
