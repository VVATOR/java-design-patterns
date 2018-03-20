package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class BasedOnWrappEnumSingletonTest extends SingletonTest<BasedOnWrappEnumSingleton> {

	public BasedOnWrappEnumSingletonTest() {
		super(BasedOnWrappEnumSingleton::getInstance);
	}

}
