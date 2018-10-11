package tech.lewiszlw.builderpattern.pack.impl;

import tech.lewiszlw.builderpattern.pack.Packing;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:16:11
 */
public class Bowl implements Packing {
    @Override public void pack() {
        System.out.println("碗打包");
    }

    @Override
    public String toString() {
        return "碗打包";
    }
}
