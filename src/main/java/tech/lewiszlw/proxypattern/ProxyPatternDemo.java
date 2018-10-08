package tech.lewiszlw.proxypattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/18
 * Time:10:56
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("image001.jpg");
        image.display();
    }
}
