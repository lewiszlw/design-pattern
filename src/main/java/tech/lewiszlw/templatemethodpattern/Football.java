package tech.lewiszlw.templatemethodpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/8
 * Time:11:24
 */
public class Football extends Game {
    @Override protected void init() {
        System.out.println("Football init");
    }

    @Override protected void startPlay() {
        System.out.println("Football start...");
    }

    @Override protected void playing() {
        System.out.println("playing...");
    }

    @Override protected void endPlay() {
        System.out.println("Football end...");
    }
}
