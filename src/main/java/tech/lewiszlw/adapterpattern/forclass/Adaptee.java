package tech.lewiszlw.adapterpattern.forclass;

/**
 * Desc: 老接口或被适配的接口
 *
 * @author zhanglinwei02
 * @date 2018/11/19
 */
public class Adaptee {
    public void oldRequest() {
        System.out.println("老接口业务逻辑");
    }
}
