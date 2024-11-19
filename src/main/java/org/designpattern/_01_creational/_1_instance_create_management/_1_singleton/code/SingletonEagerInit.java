package org.designpattern._01_creational._1_instance_create_management._1_singleton.code;

public class SingletonEagerInit {
    private static final SingletonEagerInit INSTANCE = new SingletonEagerInit();

    private SingletonEagerInit() {}

    public static SingletonEagerInit getInstance() {
        return INSTANCE;
    }
}
