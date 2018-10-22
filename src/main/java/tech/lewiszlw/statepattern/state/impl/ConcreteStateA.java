package tech.lewiszlw.statepattern.state.impl;

import tech.lewiszlw.statepattern.Context;
import tech.lewiszlw.statepattern.state.State;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:10:44
 */
public class ConcreteStateA implements State {

    @Override public void handle(Context context) {
        System.out.println("当前状态为：状态B");
        context.setState(new ConcreteStateB());
    }
}
