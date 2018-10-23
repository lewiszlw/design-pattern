package tech.lewiszlw.iteratorpattern.container.impl;

import tech.lewiszlw.iteratorpattern.Iterator;
import tech.lewiszlw.iteratorpattern.container.Container;

import java.util.NoSuchElementException;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/23
 * Time:16:12
 */
public class NameRepository implements Container<String> {
    private String[] names = {"lewis", "tom", "john"};

    @Override public Iterator<String> getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String> {

        int index = 0;

        @Override public boolean hasNext() {
            return index < names.length;
        }

        @Override public String next() {
            if (this.hasNext()) {
                return names[index++];
            } else {
                throw new NoSuchElementException();
            }
        }
    }
}
