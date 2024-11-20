package org.designpattern._02_structural._1_one_to_one._1_adapter.code;

public class Client {
    public static void main(String[] args) {
        Socket220V adaptee = new Socket220V();

        Socket110V adapter = new PowerAdapter(adaptee);

        // Socket110V 의 connect 만 사용 가능할 경우
        adaptee.connect();
    }
}
