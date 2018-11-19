package tech.lewiszlw.adapterpattern.forobject.adapter.impl;

import lombok.Setter;
import tech.lewiszlw.adapterpattern.forobject.adaptee.Adaptee;
import tech.lewiszlw.adapterpattern.forobject.adapter.Target;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:11:59
 */
public class Adapter implements Target {

    @Setter
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override public void request() {
        adaptee.specificRequest();
    }
}
