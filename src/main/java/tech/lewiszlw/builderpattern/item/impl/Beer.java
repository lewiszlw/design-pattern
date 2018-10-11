package tech.lewiszlw.builderpattern.item.impl;

import tech.lewiszlw.builderpattern.item.Item;
import tech.lewiszlw.builderpattern.pack.impl.Bottle;
import tech.lewiszlw.builderpattern.pack.impl.Bowl;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:54
 */
public class Beer implements Item {

    private final String name = "啤酒";

    private final float price = 5.6f;

    private final Bottle pack = new Bottle();

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
