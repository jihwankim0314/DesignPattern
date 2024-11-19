package org.designpattern._01_creational._1_instance_management._1_singleton.code;

public class SingletonPrivateStatic {
    private static SingletonPrivateStatic instance;

    private SingletonPrivateStatic() {}

    public static SingletonPrivateStatic getInstance() {
        return instance;
    }
}
