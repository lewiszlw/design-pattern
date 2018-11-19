package tech.lewiszlw.decoratorpattern;

import tech.lewiszlw.decoratorpattern.component.Component;
import tech.lewiszlw.decoratorpattern.component.ConcreteComponent;
import tech.lewiszlw.decoratorpattern.decorator.ConcreteDecorator;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:10:02
 */
public class Client {

    public static void main(String[] args) {

        ConcreteDecorator concreteDecorator = new ConcreteDecorator(new ConcreteComponent());
        concreteDecorator.operation();

    }

}
