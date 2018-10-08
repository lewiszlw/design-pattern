package tech.lewiszlw.simplefactorypattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/4
 * Time:14:39
 */
public class SimpleFactoryPatternDemo {
    public static void main(String[] args) {
        try {
            IShape shape = ShapeFactory.getShape("Circle");
            System.out.println(shape.shapeName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
