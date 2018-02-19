package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	private StaticBlockSingleton() {
		System.out.println("Create StaticBlockSingleton");
	}

	public static StaticBlockSingleton getInstance() {
		System.out.println("\tget from memory StaticBlockSingleton");
		return instance;
	}
}