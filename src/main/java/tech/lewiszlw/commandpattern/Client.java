package tech.lewiszlw.commandpattern;

import tech.lewiszlw.commandpattern.command.Command;
import tech.lewiszlw.commandpattern.command.impl.ConcreteCommand;
import tech.lewiszlw.commandpattern.invoker.Invoker;
import tech.lewiszlw.commandpattern.invoker.impl.ConcreteInvoker;
import tech.lewiszlw.commandpattern.receiver.Receivable;
import tech.lewiszlw.commandpattern.receiver.impl.Receiver;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:59
 */
public class Client {

    public static void main(String[] args) {
        Receivable receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new ConcreteInvoker(command);

        invoker.invoke();
    }
}
