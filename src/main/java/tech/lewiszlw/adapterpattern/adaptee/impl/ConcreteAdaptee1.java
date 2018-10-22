package tech.lewiszlw.adapterpattern.adaptee.impl;

import tech.lewiszlw.adapterpattern.adaptee.Adaptee;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:12:13
 */
public class ConcreteAdaptee1 implements Adaptee {

    @Override public void specificRequest() {
        System.out.println("执行业务代码1");
    }
}
