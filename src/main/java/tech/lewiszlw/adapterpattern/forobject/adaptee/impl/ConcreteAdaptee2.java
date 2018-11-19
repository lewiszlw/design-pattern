package tech.lewiszlw.adapterpattern.forobject.adaptee.impl;

import tech.lewiszlw.adapterpattern.forobject.adaptee.Adaptee;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:12:14
 */
public class ConcreteAdaptee2 implements Adaptee {

    @Override public void specificRequest() {
        System.out.println("执行业务代码2");
    }
}
