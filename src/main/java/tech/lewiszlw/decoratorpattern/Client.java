package tech.lewiszlw.decoratorpattern;

import tech.lewiszlw.decoratorpattern.component.Component;
import tech.lewiszlw.decoratorpattern.component.ConcreteComponent;
import tech.lewiszlw.decoratorpattern.decorator.ConcreteDecorator;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:10:02
 */
public class Client {

    public static void main(String[] args) {

        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();

    }

}
