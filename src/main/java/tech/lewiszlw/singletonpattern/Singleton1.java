package tech.lewiszlw.singletonpattern;

/**
 * Desc: 懒汉式，线程不安全
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:23
 */
public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
