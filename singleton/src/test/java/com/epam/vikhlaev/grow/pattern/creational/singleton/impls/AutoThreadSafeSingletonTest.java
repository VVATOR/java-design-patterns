package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AutoThreadSafeSingletonTest extends SingletonTest<AutoThreadSafeSingleton> {

	public AutoThreadSafeSingletonTest() {
		super(AutoThreadSafeSingleton::getInstance);		
	}

}
