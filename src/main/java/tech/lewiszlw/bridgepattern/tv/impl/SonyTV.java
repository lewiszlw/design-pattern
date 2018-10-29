package tech.lewiszlw.bridgepattern.tv.impl;

import tech.lewiszlw.bridgepattern.tv.ITV;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:24
 */
public class SonyTV implements ITV {
    @Override public void on() {
        System.out.println("Sony TV is on");
    }

    @Override public void off() {
        System.out.println("Sony TV is off");
    }

    @Override public void switchChannel(Integer channel) {
        System.out.println("Sony TV: channel - " + channel);
    }
}
