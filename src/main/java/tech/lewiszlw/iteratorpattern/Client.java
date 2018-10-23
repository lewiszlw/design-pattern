package tech.lewiszlw.iteratorpattern;

import tech.lewiszlw.iteratorpattern.container.impl.NameRepository;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:16:07
 */
public class Client {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
