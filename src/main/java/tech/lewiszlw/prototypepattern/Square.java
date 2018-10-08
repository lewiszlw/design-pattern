package tech.lewiszlw.prototypepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/21
 * Time:12:05
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override void draw() {
        System.out.println("draw square");
    }
}
