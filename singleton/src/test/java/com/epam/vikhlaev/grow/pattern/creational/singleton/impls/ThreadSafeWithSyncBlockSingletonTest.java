package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class ThreadSafeWithSyncBlockSingletonTest extends SingletonTest<ThreadSafeWithSyncBlockSingleton> {

	public ThreadSafeWithSyncBlockSingletonTest() {
		super(ThreadSafeWithSyncBlockSingleton::getInstance);
	}

}
