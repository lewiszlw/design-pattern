package tech.lewiszlw.singletonpattern;

/**
 * Desc: 静态内部类
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:31
 */
public class Singleton5 {

    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5 (){}

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
