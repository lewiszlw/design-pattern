package tech.lewiszlw.builderpattern.item.impl;

import tech.lewiszlw.builderpattern.item.Item;
import tech.lewiszlw.builderpattern.pack.Packing;
import tech.lewiszlw.builderpattern.pack.impl.Bottle;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:49
 */
public class Milk implements Item {

    private final String name = "牛奶";

    private final float price = 4f;

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
