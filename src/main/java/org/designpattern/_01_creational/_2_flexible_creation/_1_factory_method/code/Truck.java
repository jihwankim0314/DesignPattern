package org.designpattern._01_creational._2_flexible_creation._1_factory_method.code;

// Concrete Product
public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("트럭으로 배송합니다. ");
    }
}
