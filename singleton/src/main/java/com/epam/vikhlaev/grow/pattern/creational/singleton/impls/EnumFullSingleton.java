package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

public enum EnumFullSingleton {
	INSTANCE;
	private EnumFullSingleton() {
		System.out.println("EnumFullSingleton is work");
	}

	public static EnumFullSingleton getInstance() {
		return EnumFullSingleton.INSTANCE;
	}
}