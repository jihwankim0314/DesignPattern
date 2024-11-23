package org.designpattern._03_behavioral._1_external_communication._5_observer.code;

public class NewsSubscriber implements Observer {
    String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}
