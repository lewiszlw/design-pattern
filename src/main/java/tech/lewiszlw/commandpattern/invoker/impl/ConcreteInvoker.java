package tech.lewiszlw.commandpattern.invoker.impl;

import tech.lewiszlw.commandpattern.command.Command;
import tech.lewiszlw.commandpattern.invoker.Invoker;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:12:10
 */
public class ConcreteInvoker implements Invoker {

    private Command command;

    public ConcreteInvoker(Command command) {
        this.command = command;
    }

    @Override public void invoke() {
        System.out.println("开始发送命令...");
        command.execute();
    }
}
