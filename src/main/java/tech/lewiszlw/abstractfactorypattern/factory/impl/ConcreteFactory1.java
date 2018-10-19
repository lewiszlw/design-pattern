package tech.lewiszlw.abstractfactorypattern.factory.impl;

import tech.lewiszlw.abstractfactorypattern.factory.AbstractFactory;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductA1;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductA2;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductB1;
import tech.lewiszlw.abstractfactorypattern.product.impl.ProductB2;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:41
 */
public class ConcreteFactory1 extends AbstractFactory {

    @Override public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
