package com.epam.vikhlaev.grow.pattern.creational.singleton;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.AutoThreadSafeSingletonTest;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.BasedOnWrappEnumSingletonTest;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.EagerSingletonTest;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.EnumFullSingletonTest;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.LazySingletonTest;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.StaticBlockSingletonTest;

@RunWith(Suite.class)
@SuiteClasses({
        AutoThreadSafeSingletonTest.class,
        BasedOnWrappEnumSingletonTest.class,
        EagerSingletonTest.class,
        EnumFullSingletonTest.class,
        LazySingletonTest.class,
        StaticBlockSingletonTest.class })
public class SingletonTestSuite {

}
