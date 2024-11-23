package org.designpattern._03_behavioral._1_external_communication._5_observer.code;

public class NewsPublisher extends Subject {
    public void publishNews(String news) {
        System.out.println("News Published: " + news);
        notifyObservers(news);
    }
}
