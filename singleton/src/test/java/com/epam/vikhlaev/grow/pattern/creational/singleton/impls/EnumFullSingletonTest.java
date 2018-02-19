package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class EnumFullSingletonTest extends SingletonTest<EnumFullSingleton> {

	public EnumFullSingletonTest() {
		super(EnumFullSingleton::getInstance);
	}

}
