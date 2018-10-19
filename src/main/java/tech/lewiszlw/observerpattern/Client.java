package tech.lewiszlw.observerpattern;

import tech.lewiszlw.observerpattern.observer.impl.StudentObserver;
import tech.lewiszlw.observerpattern.observer.impl.WorkerObserver;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:09:39
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new Subject("国庆节", false);

        new StudentObserver(subject);
        new WorkerObserver(subject);

        subject.setState(true);
    }
}
