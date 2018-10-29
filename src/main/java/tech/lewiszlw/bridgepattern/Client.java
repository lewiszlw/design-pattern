package tech.lewiszlw.bridgepattern;

import tech.lewiszlw.bridgepattern.remotecontrol.impl.LogitechRemoteControl;
import tech.lewiszlw.bridgepattern.tv.ITV;
import tech.lewiszlw.bridgepattern.tv.impl.SonyTV;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:10:59
 */
public class Client {

    public static void main(String[] args) {
        ITV tv = new SonyTV();
        LogitechRemoteControl lrc = new LogitechRemoteControl(tv);
        lrc.setChannelKeyboard(10);
    }
}
