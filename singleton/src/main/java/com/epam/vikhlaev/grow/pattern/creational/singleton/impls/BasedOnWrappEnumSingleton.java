package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class BasedOnWrappEnumSingleton {
	private enum Instance {
		INSTANCE;

		private Instance() {
			System.out.println("\tcreate BasedOnWrappEnumSingleton Instance");
		}

		public BasedOnWrappEnumSingleton getInstance() {
			System.out.println("\tget from memory BasedOnWrappEnumSingleton Instance");
			return new BasedOnWrappEnumSingleton();
		}
	}

	private BasedOnWrappEnumSingleton() {
		System.out.println("Create BasedOnWrappEnumSingleton");
	}

	public static BasedOnWrappEnumSingleton getInstance() {
		System.out.println("\tget from memory BasedOnWrappEnumSingleton");
		return Instance.INSTANCE.getInstance();
	}
}
