package org.designpattern._01_creational._2_flexible_creation._3_builder.code;

// Director : 빌더를 이용하여, product 를 조립하는 요소
// 써도 되고, 안써도 됨
public class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza getNoSourcePizza() {
        return builder.size("mySize").topping("myTopping").build();
    }

    public Pizza getPerfectPizza() {
        return builder.size("mySize").source("mySource").topping("myTopping").build();
    }
}
