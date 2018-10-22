package tech.lewiszlw.statepattern.state;

import tech.lewiszlw.statepattern.Context;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:10:43
 */
public interface State {

    void handle(Context context);
}
