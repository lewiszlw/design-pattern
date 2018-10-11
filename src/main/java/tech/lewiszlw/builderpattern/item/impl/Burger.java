package tech.lewiszlw.builderpattern.item.impl;

import tech.lewiszlw.builderpattern.item.Item;
import tech.lewiszlw.builderpattern.pack.impl.Bowl;
import tech.lewiszlw.builderpattern.pack.impl.Wrapper;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:47
 */
public class Burger implements Item {

    private final String name = "汉堡";

    private final float price = 12.5f;

    private final Wrapper pack = new Wrapper();

    @Override public String getName() {
        return name;
    }

    @Override public float getPrice() {
        return price;
    }

    @Override public void pack() {
        pack.pack();
    }

    @Override public String getPack() {
        return pack.toString();
    }
}
