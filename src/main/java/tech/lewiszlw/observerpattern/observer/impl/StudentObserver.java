package tech.lewiszlw.observerpattern.observer.impl;

import tech.lewiszlw.observerpattern.Subject;
import tech.lewiszlw.observerpattern.observer.Observer;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:09:40
 */
public class StudentObserver extends Observer {

    public StudentObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override public void listen() {
        System.out.println("学生：放假咯。");
    }
}
