package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class LazySingleton {
	private static LazySingleton instance;

	private LazySingleton() {
		System.out.println("Create LazySingleton");
	}

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		System.out.println("\tget from memory LazySingleton");
		return instance;
	}
}