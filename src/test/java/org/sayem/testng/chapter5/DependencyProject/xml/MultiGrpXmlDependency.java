package org.sayem.testng.chapter5.DependencyProject.xml;

import org.testng.annotations.Test;

public class MultiGrpXmlDependency {
	@Test(groups={"dependent-group"})
	public void groupTestOne(){
		System.out.println("Group Test method one");
	}
	
	@Test(groups={"test-group-one"})
	public void groupTestTwo(){
		System.out.println("Group test method two");
	}
	
	@Test(groups={"test-group-two"})
	public void groupTestThree(){
		System.out.println("Group Test method three");
	}
}
