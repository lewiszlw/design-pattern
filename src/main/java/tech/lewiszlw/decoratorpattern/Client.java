package tech.lewiszlw.decoratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/13
 * Time:10:02
 */
public class Client {

    public static void main(String[] args) {

        Person person = new PersonImpl();

        Person student = new StudentDecorator(person);
        student.dress();

        Person teacher = new TeacherDecorator(student);
        teacher.dress();

    }

}
