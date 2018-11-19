package tech.lewiszlw.proxypattern;

import tech.lewiszlw.proxypattern.subject.Image;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/18
 * Time:10:56
 */
public class Client {
    public static void main(String[] args) {
        Image image = new ImageProxy("image001.jpg");
        image.display();
    }
}
