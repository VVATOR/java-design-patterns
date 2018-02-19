package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public class BasedOnWrappEnumSingleton {
	private enum Instance {
		INSTANCE(new BasedOnWrappEnumSingleton());

		private BasedOnWrappEnumSingleton instance;

		private Instance(BasedOnWrappEnumSingleton instance) {
			System.out.println("\tcreate BasedOnWrappEnumSingleton Instance");
			this.instance = instance;
		}

		public BasedOnWrappEnumSingleton getInstance() {
			System.out.println("\tget from memory BasedOnWrappEnumSingleton Instance");
			return this.instance;
		}
	}

	private BasedOnWrappEnumSingleton() {
		System.out.println("Create BasedOnWrappEnumSingleton");
	}

	public static BasedOnWrappEnumSingleton getInstance() {
		return Instance.INSTANCE.getInstance();
	}
}
