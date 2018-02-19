package com.epam.vikhlaev.grow.pattern.creational.singleton;

import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.AutoThreadSafeSingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.BasedOnWrappEnumSingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.EagerSingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.EnumFullSingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.LazySingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.StaticBlockSingleton;
import com.epam.vikhlaev.grow.pattern.creational.singleton.impls.ThreadSafeWithSyncBlockSingleton;

public final class Runner {
	public static void main(String[] args) {
		System.out.println("\n---StaticBlockSingleton---");
		StaticBlockSingleton blockSingleton = StaticBlockSingleton.getInstance();
		StaticBlockSingleton blockSingleton1 = StaticBlockSingleton.getInstance();

		System.out.println("\n---EagerSingleton---");
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		System.out.println();

		System.out.println("\n---LazySingleton---");
		LazySingleton lazySingleton = LazySingleton.getInstance();
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		System.out.println();

		System.out.println("\n---BasedOnWrappEnumSingleton---");
		BasedOnWrappEnumSingleton basedOnWrappEnumSingleton = BasedOnWrappEnumSingleton.getInstance();
		BasedOnWrappEnumSingleton basedOnWrappEnumSingleton1 = BasedOnWrappEnumSingleton.getInstance();
		BasedOnWrappEnumSingleton basedOnWrappEnumSingleton2 = BasedOnWrappEnumSingleton.getInstance();
		System.out.println();

		System.out.println("\n---BasedOnWrappEnumSingleton---");
		EnumFullSingleton enumFullSingleton = EnumFullSingleton.INSTANCE;
		EnumFullSingleton enumFullSingleton1 = EnumFullSingleton.INSTANCE;
		System.out.println();

		System.out.println("\n---ThreadSafeWithSyncBlockSingleton---");
		ThreadSafeWithSyncBlockSingleton safeSingleton = ThreadSafeWithSyncBlockSingleton.getInstance();
		ThreadSafeWithSyncBlockSingleton safeSingleton1 = ThreadSafeWithSyncBlockSingleton.getInstance();
		ThreadSafeWithSyncBlockSingleton safeSingleton2 = ThreadSafeWithSyncBlockSingleton.getInstance();
		ThreadSafeWithSyncBlockSingleton safeSingleton3 = ThreadSafeWithSyncBlockSingleton.getInstance();
		System.out.println();

		System.out.println("\n---AutoThreadSafeSingleton---");
		AutoThreadSafeSingleton autoThreadSafeSingleton = AutoThreadSafeSingleton.getInstance();
		AutoThreadSafeSingleton autoThreadSafeSingleton1 = AutoThreadSafeSingleton.getInstance();
		AutoThreadSafeSingleton autoThreadSafeSingleton2 = AutoThreadSafeSingleton.getInstance();
		AutoThreadSafeSingleton autoThreadSafeSingleton3 = AutoThreadSafeSingleton.getInstance();
		System.out.println();

	}
}
