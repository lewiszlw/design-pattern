package tech.lewiszlw.commandpattern.receiver.impl;

import tech.lewiszlw.commandpattern.receiver.Receivable;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:12:04
 */
public class Receiver implements Receivable {
    @Override public void action() {
        System.out.println("接受者：收到命令，执行操作!");
    }
}
