package org.designpattern._03_behavioral._1_external_communication._3_interpreter.code;

public class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
