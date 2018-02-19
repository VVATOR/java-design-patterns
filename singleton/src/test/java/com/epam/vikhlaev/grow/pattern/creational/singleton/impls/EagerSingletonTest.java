package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class EagerSingletonTest extends SingletonTest<EagerSingleton> {

	public EagerSingletonTest() {
		super(EagerSingleton::getInstance);
	}
}
