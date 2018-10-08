package tech.lewiszlw.decoratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/13
 * Time:09:52
 */
public class Decorator implements Person {
    private Person person;

    public Decorator(Person person) {
        this.person = person;
    }

    @Override public void dress() {
        person.dress();
    }
}
