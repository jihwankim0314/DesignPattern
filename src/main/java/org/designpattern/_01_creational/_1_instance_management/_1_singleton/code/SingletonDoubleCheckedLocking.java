package org.designpattern._01_creational._1_instance_management._1_singleton.code;

public class SingletonDoubleCheckedLocking {
    private static SingletonDoubleCheckedLocking INSTANCE;

    private SingletonDoubleCheckedLocking() {}

    public static SingletonDoubleCheckedLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonDoubleCheckedLocking();
                }
            }
        }

        return INSTANCE;
    }
}
