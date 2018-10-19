package tech.lewiszlw.abstractfactorypattern.product.impl;

import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:24
 */
public class ProductA1 extends AbstractProductA {

    @Override public void use() {
        System.out.println("use productA1");
    }
}
