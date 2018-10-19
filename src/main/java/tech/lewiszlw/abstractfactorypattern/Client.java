package tech.lewiszlw.abstractfactorypattern;

import tech.lewiszlw.abstractfactorypattern.factory.AbstractFactory;
import tech.lewiszlw.abstractfactorypattern.factory.impl.ConcreteFactory1;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:10
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();

        AbstractProductA productA = factory1.createProductA();
        AbstractProductB productB = factory1.createProductB();

        productA.use();
        productB.eat();
    }
}
