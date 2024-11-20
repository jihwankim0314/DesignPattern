package org.designpattern._01_creational._2_flexible_creation._3_builder.code;

public interface PizzaBuilder {
    PizzaBuilder size(String size);
    PizzaBuilder source(String source);
    PizzaBuilder topping(String topping);
    Pizza build();
}
