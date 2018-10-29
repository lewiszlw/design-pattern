package tech.lewiszlw.chainofresponsibilitypattern.handler.impl;

import tech.lewiszlw.chainofresponsibilitypattern.handler.Handler;
import tech.lewiszlw.chainofresponsibilitypattern.request.Request;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:16:28
 */
public class ConcreteHandler1 extends Handler {

    @Override public void handleRequest(Request request) {
        if (request.getCode() < 3) {
            System.out.println("Requset code < 3, ConcreteHandler1 处理请求完成");
        } else {
            System.out.println("ConcreteHandler1 无法处理请求，传递给下一个处理");
            setSuccessor(new ConcreteHandler2());
            successor.handleRequest(request);
        }
    }
}
