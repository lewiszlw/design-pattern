package tech.lewiszlw.abstractfactorypattern.factory;

import tech.lewiszlw.abstractfactorypattern.product.AbstractProductA;
import tech.lewiszlw.abstractfactorypattern.product.AbstractProductB;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/19
 * Time:17:39
 */
public abstract class AbstractFactory {

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}
