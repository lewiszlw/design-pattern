package tech.lewiszlw.decoratorpattern.decorator;

import tech.lewiszlw.decoratorpattern.component.Component;
import tech.lewiszlw.decoratorpattern.decorator.Decorator;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:09:54
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override public void operation() {
        component.operation();
        addBehavior();
    }

    private void addBehavior() {
        System.out.println("业务逻辑执行完后，执行加强逻辑");
    }
}
