package tech.lewiszlw.adapterpattern;

import tech.lewiszlw.adapterpattern.adaptee.Adaptee;
import tech.lewiszlw.adapterpattern.adaptee.impl.ConcreteAdaptee1;
import tech.lewiszlw.adapterpattern.adaptee.impl.ConcreteAdaptee2;
import tech.lewiszlw.adapterpattern.adapter.Target;
import tech.lewiszlw.adapterpattern.adapter.impl.Adapter;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:11:59
 */
public class Client {
    public static void main(String[] args) {
        Target target = new Adapter(new ConcreteAdaptee1());
        target.request();

        ((Adapter) target).setAdaptee(new ConcreteAdaptee2());
        target.request();
    }
}
