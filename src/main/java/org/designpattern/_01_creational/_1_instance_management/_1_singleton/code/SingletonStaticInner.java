package org.designpattern._01_creational._1_instance_management._1_singleton.code;

public class SingletonStaticInner {
    private SingletonStaticInner() {}

    private static class SingletonHolder {
        private static final SingletonStaticInner INSTANCE = new SingletonStaticInner();
    }

    public static SingletonStaticInner getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
