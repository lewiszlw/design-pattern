package tech.lewiszlw.abstractfactorypattern.product.impl;

import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:25
 */
public class ProductA2 extends AbstractProductA {

    @Override public void use() {
        System.out.println("use productA2");
    }
}
