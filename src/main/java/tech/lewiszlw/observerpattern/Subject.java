package tech.lewiszlw.observerpattern;

import lombok.Getter;
import lombok.Setter;
import tech.lewiszlw.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:09:22
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    @Setter
    @Getter
    private String name;

    @Getter
    private boolean state;

    public Subject(String name, boolean state) {
        this.name = name;
        this.state = state;
    }

    public Subject(Observer... observers) {
        for (int i = 0; i < observers.length; i++) {
            this.observers.add(observers[i]);
        }
    }

    public void setState(boolean state) {
        if (state) {
            System.out.println("今天国庆放假");
        } else {
            System.out.println("今天未到国庆放假");
        }
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.listen());
    }


}
