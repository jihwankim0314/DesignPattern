package org.designpattern._02_structural._1_one_to_one._4_decorator.code;

public class DecoratorClient {
    public static void main(String[] args) {
        Coffee basicCoffee = new BasicCoffee(); // 5.0
        Coffee milkCoffee = new MilkDecorator(basicCoffee); // 6.5
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee); // 7.0
        Coffee milkSugarCoffee2 = new SugarDecorator(milkSugarCoffee); // 7.5 -- 설탕 2번

        System.out.println(milkSugarCoffee2.getDescription());
        System.out.println("Cost: " + milkSugarCoffee2.getCost());
    }
}
