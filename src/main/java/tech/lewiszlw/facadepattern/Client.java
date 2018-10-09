package tech.lewiszlw.facadepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/9
 * Time:23:54
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.drawBlue();
        facade.drawRed();
    }
}
