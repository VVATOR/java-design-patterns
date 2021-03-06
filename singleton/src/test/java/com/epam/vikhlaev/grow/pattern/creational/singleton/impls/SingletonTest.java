package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

import static org.junit.Assert.assertSame;

import java.util.function.Supplier;

import org.junit.Test;

public abstract class SingletonTest<T> {

	private Supplier<T> singletonMethod;

	public SingletonTest(Supplier<T> singletonMethod) {
		super();
		this.singletonMethod = singletonMethod;

	}

	@Test
	public void test_singleton() {
		T obj1 = singletonMethod.get();
		T obj2 = singletonMethod.get();
		assertSame(obj1, obj2);
	}

}
