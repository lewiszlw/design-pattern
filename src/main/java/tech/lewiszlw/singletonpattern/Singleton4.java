package tech.lewiszlw.singletonpattern;

/**
 * Desc: 双重检验锁
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:17:27
 */
public class Singleton4 {

    // 声明成 volatile
    private volatile static Singleton4 instance;

    private Singleton4 (){}

    public static Singleton4 getSingleton4() {
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
