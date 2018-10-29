package tech.lewiszlw.chainofresponsibilitypattern.handler.impl;

import tech.lewiszlw.chainofresponsibilitypattern.handler.Handler;
import tech.lewiszlw.chainofresponsibilitypattern.request.Request;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:16:37
 */
public class ConcreteHandler3 extends Handler {

    @Override public void handleRequest(Request request) {
        if (request.getCode() >= 8) {
            System.out.println("Requset code >= 8, ConcreteHandler3 处理请求完成");
        } else {
            System.out.println("ConcreteHandler3 无法处理请求，传递给下一个处理");
            throw new RuntimeException("请求无法处理");
        }
    }
}
