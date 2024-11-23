package org.designpattern._03_behavioral._1_external_communication._5_observer.code;

public class ObserverClient {
    public static void main(String[] args) {
        NewsPublisher publisher = new NewsPublisher();

        Observer subscriber1 = new NewsSubscriber("A");
        Observer subscriber2 = new NewsSubscriber("B");

        publisher.addObserver(subscriber1);
        publisher.addObserver(subscriber2);

        publisher.publishNews("치킨이 피자보다 맛있다!!");
        publisher.publishNews("피자 회사는 해당 발언에 분노했다!!");
    }
}
