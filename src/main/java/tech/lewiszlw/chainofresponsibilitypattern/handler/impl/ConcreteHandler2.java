package tech.lewiszlw.chainofresponsibilitypattern.handler.impl;

import tech.lewiszlw.chainofresponsibilitypattern.handler.Handler;
import tech.lewiszlw.chainofresponsibilitypattern.request.Request;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:16:33
 */
public class ConcreteHandler2 extends Handler {
    @Override public void handleRequest(Request request) {
        if (request.getCode() >= 3 && request.getCode() < 8) {
            System.out.println("3 =< Requset code < 8, ConcreteHandler2 处理请求完成");
        } else {
            System.out.println("ConcreteHandler2 无法处理请求，传递给下一个处理");
            setSuccessor(new ConcreteHandler3());
            successor.handleRequest(request);
        }
    }
}
