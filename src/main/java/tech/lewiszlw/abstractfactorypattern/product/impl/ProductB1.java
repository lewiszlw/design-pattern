package tech.lewiszlw.abstractfactorypattern.product.impl;

import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:26
 */
public class ProductB1 extends AbstractProductB {

    @Override public void eat() {
        System.out.println("eat productB1");
    }
}
