package tech.lewiszlw.adapterpattern.example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Desc:
 *
 * @author zhanglinwei02
 * @date 2018/11/19
 */
public class EnumerationAdapter implements Enumeration, Iterator{

    @Override public boolean hasMoreElements() {
        return hasNext();
    }

    @Override public Object nextElement() {
        return next();
    }

    @Override public boolean hasNext() {
        return true;
    }

    @Override public Object next() {
        return null;
    }
}
