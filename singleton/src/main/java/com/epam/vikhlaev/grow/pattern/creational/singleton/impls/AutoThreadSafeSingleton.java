package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class AutoThreadSafeSingleton {

	private final static AutoThreadSafeSingleton instance = new AutoThreadSafeSingleton();

	private AutoThreadSafeSingleton() {
		System.out.println("Create new AutoThreadSafeSingleton");
	}

	public static AutoThreadSafeSingleton getInstance() {
		System.out.println("\tget AutoThreadSafeSingleton  from memory");
		return instance;
	}

}