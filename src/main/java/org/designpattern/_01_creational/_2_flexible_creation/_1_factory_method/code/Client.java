package org.designpattern._01_creational._2_flexible_creation._1_factory_method.code;

public class Client {
    public static void main(String[] args) {
        TransportFactory truckFactory = new TruckFactory();
        truckFactory.planDelivery();

        TransportFactory shipFactory = new ShipFactory();
        shipFactory.planDelivery();
    }
}
