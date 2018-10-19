package tech.lewiszlw.observerpattern.observer;

import tech.lewiszlw.observerpattern.Subject;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:09:23
 */
public abstract class Observer {

    protected Subject subject;

    public abstract void listen();
}
