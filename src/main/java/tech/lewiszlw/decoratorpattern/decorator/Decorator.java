package tech.lewiszlw.decoratorpattern.decorator;

import tech.lewiszlw.decoratorpattern.component.Component;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:09:52
 */
public abstract class Decorator {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void operation();


}
