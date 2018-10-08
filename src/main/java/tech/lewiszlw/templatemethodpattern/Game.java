package tech.lewiszlw.templatemethodpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/10/8
 * Time:11:21
 */
public abstract class Game {

    protected abstract void init();

    protected abstract void startPlay();

    protected abstract void playing();

    protected abstract void endPlay();

    public final void play() {
        init();
        startPlay();
        playing();
        endPlay();
    }
}
