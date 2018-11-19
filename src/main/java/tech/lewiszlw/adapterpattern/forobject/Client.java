package tech.lewiszlw.adapterpattern.forobject;

import tech.lewiszlw.adapterpattern.forobject.adaptee.impl.ConcreteAdaptee1;
import tech.lewiszlw.adapterpattern.forobject.adaptee.impl.ConcreteAdaptee2;
import tech.lewiszlw.adapterpattern.forobject.adapter.Target;
import tech.lewiszlw.adapterpattern.forobject.adapter.impl.Adapter;

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
