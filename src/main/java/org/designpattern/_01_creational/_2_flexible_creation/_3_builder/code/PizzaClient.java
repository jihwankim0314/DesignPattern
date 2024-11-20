package org.designpattern._01_creational._2_flexible_creation._3_builder.code;

public class PizzaClient {
    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector(new CustomPizzaBuilder());

        director.getNoSourcePizza();
        director.getPerfectPizza();
    }
}
