package org.designpattern._02_structural._1_one_to_one._4_decorator.code;

// ConcreteComponent
public class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "basic coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
