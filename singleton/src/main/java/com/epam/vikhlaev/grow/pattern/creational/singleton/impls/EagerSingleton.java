package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class EagerSingleton {

	private static EagerSingleton instance = new EagerSingleton();

	private EagerSingleton() {
		System.out.println("Create EagerSingleton");
	}

	public static EagerSingleton getInstance() {
		System.out.println("\tget from memory EagerSingleton");
		return instance;
	}
}