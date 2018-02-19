package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class ThreadSafeWithSyncBlockSingleton {
	private static ThreadSafeWithSyncBlockSingleton instance = null;

	private ThreadSafeWithSyncBlockSingleton() {
		System.out.println("Create new ThreadSafeWithSyncBlockSingleton");
	}

	public static /* synchronized */ ThreadSafeWithSyncBlockSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeWithSyncBlockSingleton.class) {
				instance = new ThreadSafeWithSyncBlockSingleton();
			}
		}
		System.out.println("\tget ThreadSafeWithSyncBlockSingleton  from memory");
		return instance;
	}

}