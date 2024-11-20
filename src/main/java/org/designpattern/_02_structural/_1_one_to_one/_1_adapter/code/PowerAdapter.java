package org.designpattern._02_structural._1_one_to_one._1_adapter.code;

public class PowerAdapter implements Socket110V {
    private Socket220V adaptee;

    public PowerAdapter(Socket220V adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void providePower() {
        System.out.println("어댑터를 이용하자");
        adaptee.connect();
    }
}
