package tech.lewiszlw.decoratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:09:51
 */
public class PersonImpl implements Person {
    @Override public void dress() {
        System.out.println("persons dress clothes");
    }
}
