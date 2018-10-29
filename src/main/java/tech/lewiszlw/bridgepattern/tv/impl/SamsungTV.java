package tech.lewiszlw.bridgepattern.tv.impl;

import tech.lewiszlw.bridgepattern.tv.ITV;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:02
 */
public class SamsungTV implements ITV {
    @Override public void on() {
        System.out.println("Samsung TV is on");
    }

    @Override public void off() {
        System.out.println("Samsung TV is off");
    }

    @Override public void switchChannel(Integer channel) {
        System.out.println("Samsung TV: channel - " + channel);
    }
}
