package tech.lewiszlw.singletonpattern;

/**
 * Desc: 懒汉式，线程安全
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:24
 */
public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2 (){}

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
