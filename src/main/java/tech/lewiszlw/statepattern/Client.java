package tech.lewiszlw.statepattern;

import tech.lewiszlw.statepattern.state.impl.ConcreteStateA;
import tech.lewiszlw.statepattern.state.impl.ConcreteStateB;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:10:43
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request();
        context.setState(new ConcreteStateB());
        context.request();
    }
}
