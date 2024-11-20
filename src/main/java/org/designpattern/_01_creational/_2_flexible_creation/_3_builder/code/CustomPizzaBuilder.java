package org.designpattern._01_creational._2_flexible_creation._3_builder.code;

public class CustomPizzaBuilder implements PizzaBuilder {
    private String size;
    private String source;
    private String topping;

    public CustomPizzaBuilder() {
        this.size = "";
        this.source = "";
        this.topping = "";
    }

    public CustomPizzaBuilder(String size, String source, String topping) {
        this.size = size;
        this.source = source;
        this.topping = topping;
    }

    @Override
    public PizzaBuilder size(String size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder source(String source) {
        this.source = source;
        return this;
    }

    @Override
    public PizzaBuilder topping(String topping) {
        this.topping = topping;
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(this.size, this.source, this.topping);
    }
}
