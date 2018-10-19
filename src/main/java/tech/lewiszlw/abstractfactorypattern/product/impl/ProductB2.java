package tech.lewiszlw.abstractfactorypattern.product.impl;

import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:39
 */
public class ProductB2 extends AbstractProductB {

    @Override public void eat() {
        System.out.println("eat productB2");
    }
}
