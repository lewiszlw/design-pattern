package tech.lewiszlw.prototypepattern;

import lombok.Getter;
import lombok.Setter;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/21
 * Time:11:50
 */
public abstract class Shape implements Cloneable {

    @Getter
    @Setter
    private String id;

    @Getter
    protected String type;

    abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
