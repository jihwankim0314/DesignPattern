package org.designpattern._02_structural._1_one_to_one._4_decorator.code;

// Concrete Decorator
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }
}
