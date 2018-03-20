package com.epam.vikhlaev.grow.pattern.creational.singleton.impls;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
        AutoThreadSafeSingletonTest.class,
        BasedOnWrappEnumSingletonTest.class,
        EagerSingletonTest.class,
        EnumFullSingletonTest.class,
        LazySingletonTest.class,
        StaticBlockSingletonTest.class })
public class AllTest {

}
