package tech.lewiszlw.bridgepattern.remotecontrol.impl;

import tech.lewiszlw.bridgepattern.remotecontrol.AbstractRemoteControl;
import tech.lewiszlw.bridgepattern.tv.ITV;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:11:28
 */
public class LogitechRemoteControl extends AbstractRemoteControl {

    public LogitechRemoteControl(ITV tv) {
        super(tv);
    }

    public void setChannelKeyboard(Integer channel) {
        setChannel(channel);
        System.out.println("Logitech use keyword to set channel.");
    }
}
