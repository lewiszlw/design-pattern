package tech.lewiszlw.commandpattern.command.impl;

import tech.lewiszlw.commandpattern.command.Command;
import tech.lewiszlw.commandpattern.receiver.Receivable;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:12:01
 */
public class ConcreteCommand implements Command {

    private Receivable receiver;

    public ConcreteCommand(Receivable receiver) {
        this.receiver = receiver;
    }

    @Override public void execute() {
        System.out.println("命令开始执行！");
        receiver.action();
    }
}
