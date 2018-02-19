package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class LazySingletonTest extends SingletonTest<LazySingleton> {

	public LazySingletonTest() {
		super(LazySingleton::getInstance);
	}
}
