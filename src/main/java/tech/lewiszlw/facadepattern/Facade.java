package tech.lewiszlw.facadepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/9
 * Time:23:52
 */
public class Facade {

    private Blue blue;

    private Red red;

    public Facade() {
        blue = new Blue();
        red = new Red();
    }

    public void drawBlue() {
        blue.draw();
    }

    public void drawRed() {
        red.draw();
    }
}
