package org.designpattern._01_creational._2_flexible_creation._1_factory_method.code;

public class ShipFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
