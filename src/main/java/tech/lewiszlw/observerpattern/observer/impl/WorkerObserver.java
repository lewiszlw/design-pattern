package tech.lewiszlw.observerpattern.observer.impl;

import tech.lewiszlw.observerpattern.Subject;
import tech.lewiszlw.observerpattern.observer.Observer;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:09:42
 */
public class WorkerObserver extends Observer {

    public WorkerObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override public void listen() {
        System.out.println("工人：终于可以休息了。");
    }
}
