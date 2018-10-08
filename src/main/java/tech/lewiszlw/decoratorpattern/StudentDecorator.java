package tech.lewiszlw.decoratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/13
 * Time:09:54
 */
public class StudentDecorator extends Decorator {

    public StudentDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        System.out.println("students dress school uniform");
    }
}
