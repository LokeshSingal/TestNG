package org.sayem.testng.chapter6.factory.factory;

import org.testng.annotations.Factory;

import org.sayem.testng.chapter6.factory.classes.ExampleTest;

public class ExampleFactory {
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
			new ExampleTest("one"),
			new ExampleTest("two")
		};
	}

}
