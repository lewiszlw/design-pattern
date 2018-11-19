package tech.lewiszlw.adapterpattern.forclass;

/**
 * Desc: 适配器类
 *
 * @author zhanglinwei02
 * @date 2018/11/19
 */
public class Adapter extends Adaptee implements Target {

    @Override public void request() {
        oldRequest();
    }
}
