package org.designpattern._02_structural._2_one_to_many._2_flyweight.code;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState; //

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String externalState) {
        System.out.println("Intrinsic: "+ intrinsicState + ", external: " + externalState);
    }
}
