package tech.lewiszlw.bridgepattern.remotecontrol;

import tech.lewiszlw.bridgepattern.tv.ITV;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:26
 */
public abstract class AbstractRemoteControl {

    private ITV tv;

    protected AbstractRemoteControl(ITV tv) {
        this.tv = tv;
    }

    protected void turnOn() {
        tv.on();
    }

    protected void turnOff() {
        tv.off();
    }

    protected void setChannel(Integer channel) {
        tv.switchChannel(channel);
    }
}
