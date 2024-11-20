package org.designpattern._01_creational._2_flexible_creation._1_factory_method.code;

// Creator
public abstract class TransportFactory {
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
