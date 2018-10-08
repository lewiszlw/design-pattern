package tech.lewiszlw.prototypepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/21
 * Time:12:06
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override void draw() {
        System.out.println("draw circle");
    }
}
