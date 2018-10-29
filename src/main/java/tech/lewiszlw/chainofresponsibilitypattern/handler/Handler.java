package tech.lewiszlw.chainofresponsibilitypattern.handler;

import lombok.Getter;
import lombok.Setter;
import tech.lewiszlw.chainofresponsibilitypattern.request.Request;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:16:20
 */
public abstract class Handler {

    @Setter
    public Handler successor;

    public abstract void handleRequest(Request request);
}
