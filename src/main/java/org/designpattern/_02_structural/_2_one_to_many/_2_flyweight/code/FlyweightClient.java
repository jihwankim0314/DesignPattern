package org.designpattern._02_structural._2_one_to_many._2_flyweight.code;

public class FlyweightClient {
    public static void main(String[] args) {
        FlyweightCache flyweightCache = new FlyweightCache();

        Flyweight flyweight1 = flyweightCache.getFlyweight("A");
        flyweight1.operation("external 1");

        // Cache 에 저장되어 있어서, 기존 것 재사용
        Flyweight flyweight2 = flyweightCache.getFlyweight("A");
        flyweight2.operation("external 2");

        Flyweight flyweight3 = flyweightCache.getFlyweight("B");
        flyweight3.operation("external 3");
    }
}
