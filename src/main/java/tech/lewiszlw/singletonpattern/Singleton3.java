package tech.lewiszlw.singletonpattern;

/**
 * Desc: 饿汉式
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:25
 */
public class Singleton3 {

    private static Singleton3 instance = new Singleton3();

    private Singleton3 (){}

    public static Singleton3 getInstance() {
        return instance;
    }
}
