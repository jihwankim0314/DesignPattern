package org.designpattern._02_structural._1_one_to_one._4_decorator.code;

// Concrete Decorator
public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
}
