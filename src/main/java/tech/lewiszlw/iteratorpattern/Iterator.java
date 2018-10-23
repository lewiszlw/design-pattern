package tech.lewiszlw.iteratorpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:16:08
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();

}
