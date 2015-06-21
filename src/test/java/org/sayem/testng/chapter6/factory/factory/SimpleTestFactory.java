package org.sayem.testng.chapter6.factory.factory;

import org.sayem.testng.chapter6.factory.classes.SimpleTest;
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
