package tech.lewiszlw.decoratorpattern.component;

import tech.lewiszlw.decoratorpattern.component.Component;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:09:51
 */
public class ConcreteComponent implements Component {
    @Override public void operation() {
        System.out.println("业务逻辑");
    }
}
