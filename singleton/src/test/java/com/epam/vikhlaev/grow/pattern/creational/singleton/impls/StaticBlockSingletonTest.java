package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class StaticBlockSingletonTest extends SingletonTest<StaticBlockSingleton> {

	public StaticBlockSingletonTest() {
		super(StaticBlockSingleton::getInstance);
	}
}
