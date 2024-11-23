package org.designpattern._03_behavioral._1_external_communication._5_observer.code;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}
