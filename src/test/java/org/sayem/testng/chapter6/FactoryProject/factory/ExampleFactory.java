package org.sayem.testng.chapter6.FactoryProject.factory;

import org.testng.annotations.Factory;

import org.sayem.testng.chapter6.FactoryProject.classes.ExampleTest;

public class ExampleFactory {
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
			new ExampleTest("one"),
			new ExampleTest("two")
		};
	}

}
