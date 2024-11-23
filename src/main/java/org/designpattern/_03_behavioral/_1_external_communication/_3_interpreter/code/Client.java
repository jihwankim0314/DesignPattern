package org.designpattern._03_behavioral._1_external_communication._3_interpreter.code;

public class Client {
    public static void main(String[] args) {
        Expression number1 = new NumberExpression(1);
        Expression number2 = new NumberExpression(2);
        Expression number3 = new NumberExpression(3);

        Expression addExpression = new AddExpression(number1, number2);

        Expression subtractExpression = new SubtractExpression(number3, number2);
    }
}
