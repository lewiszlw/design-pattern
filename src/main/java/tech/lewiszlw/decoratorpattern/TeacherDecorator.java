package tech.lewiszlw.decoratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/13
 * Time:09:57
 */
public class TeacherDecorator extends Decorator {

    public TeacherDecorator(Person person) {
        super(person);
    }

    @Override
    public void dress() {
        System.out.println("teachers dress work clothes");
    }
}
