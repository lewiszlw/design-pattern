package tech.lewiszlw.builderpattern.pack.impl;

import tech.lewiszlw.builderpattern.pack.Packing;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:22
 */
public class Bottle implements Packing {
    @Override public void pack() {
        System.out.println("瓶打包");
    }

    @Override
    public String toString() {
        return "瓶打包";
    }
}
