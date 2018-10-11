package tech.lewiszlw.builderpattern.item;

import tech.lewiszlw.builderpattern.pack.Packing;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:30
 */
public interface Item {

    /**
     * 商品名称
     */
    String getName();

    /**
     * 商品价格
     */
    float getPrice();

    /**
     * 打包
     */
    void pack();

    /**
     * 获取打包方式
     */
    String getPack();
}
