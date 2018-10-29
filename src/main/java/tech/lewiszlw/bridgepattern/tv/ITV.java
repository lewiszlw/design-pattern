package tech.lewiszlw.bridgepattern.tv;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:01
 */
public interface ITV {
    void on();
    void off();
    void switchChannel(Integer channel);
}
