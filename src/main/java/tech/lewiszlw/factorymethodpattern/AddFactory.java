package tech.lewiszlw.factorymethodpattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/30
 * Time:14:47
 */
public class AddFactory implements MathFactory {
    @Override public double operate(double x, double y) {
        return x + y;
    }
}
