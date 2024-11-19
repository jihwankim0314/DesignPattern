package org.designpattern._01_creational._1_instance_management._1_singleton.code;

public class SingletonSynchronized {
    private static SingletonSynchronized INSTANCE;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSynchronized();
        }

        return INSTANCE;
    }
}
