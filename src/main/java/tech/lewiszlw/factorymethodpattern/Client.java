package tech.lewiszlw.factorymethodpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/30
 * Time:15:05
 */
public class Client {

    public static void main(String[] args) {
        MathFactory addFactory = new AddFactory();
        System.out.println(addFactory.operate(1,2));

        MathFactory subFactory = new SubFactory();
        System.out.println(subFactory.operate(1,2));
    }
}
