package org.sayem.testng.chapter6.factory.factory;

import org.testng.annotations.Factory;
import org.sayem.testng.chapter6.factory.classes.DependencyTest;

public class DependencyFactory {
	@Factory
	public Object[] factoryMethod(){
		return new Object[]{
			new DependencyTest(1),
			new DependencyTest(2)
		};
	}

}
