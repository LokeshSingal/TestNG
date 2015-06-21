package org.sayem.testng.chapter6.factory.factory;

import org.testng.annotations.Factory;

import org.sayem.testng.chapter6.factory.classes.ParameterTest;

public class ParameterFactory {
	
	@Factory
	public Object[] paramFactory(){
		return new Object[]{
				new ParameterTest(0),
				new ParameterTest(1)
				};
	}
}
