package tech.lewiszlw.adapterpattern.example;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Desc:
 *
 * @author zhanglinwei02
 * @date 2018/11/19
 */
public class EnumerationAdapter implements Enumeration {
    private Iterator iterator;

    public EnumerationAdapter(Iterator iterator) {
        this.iterator = iterator;
    }

    @Override public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override public Object nextElement() {
        return iterator.next();
    }
}
