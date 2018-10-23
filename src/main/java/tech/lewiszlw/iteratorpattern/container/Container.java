package tech.lewiszlw.iteratorpattern.container;

import tech.lewiszlw.iteratorpattern.Iterator;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:16:10
 */
public interface Container<E> {

    Iterator<E> getIterator();
}
