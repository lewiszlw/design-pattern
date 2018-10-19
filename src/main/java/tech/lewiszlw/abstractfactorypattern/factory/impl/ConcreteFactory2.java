package tech.lewiszlw.abstractfactorypattern.factory.impl;

import tech.lewiszlw.abstractfactorypattern.factory.AbstractFactory;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductA2;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductB2;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:50
 */
public class ConcreteFactory2 extends AbstractFactory {

    @Override public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
