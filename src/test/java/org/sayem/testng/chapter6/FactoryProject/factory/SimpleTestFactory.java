package org.sayem.testng.chapter6.FactoryProject.factory;

import org.sayem.testng.chapter6.FactoryProject.classes.SimpleTest;
import org.testng.annotations.Factory;

public class SimpleTestFactory {
	
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
				new SimpleTest(),
				new SimpleTest()
				};
	}

}
