package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class AutoThreadSafeSingletonTest extends SingletonTest<AutoThreadSafeSingleton> {

	public AutoThreadSafeSingletonTest() {
		super(AutoThreadSafeSingleton::getInstance);		
	}

}
