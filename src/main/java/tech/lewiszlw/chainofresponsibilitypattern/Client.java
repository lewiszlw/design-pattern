package tech.lewiszlw.chainofresponsibilitypattern;

import tech.lewiszlw.chainofresponsibilitypattern.handler.Handler;
import tech.lewiszlw.chainofresponsibilitypattern.handler.impl.ConcreteHandler1;
import tech.lewiszlw.chainofresponsibilitypattern.request.Request;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/29
 * Time:16:19
 */
public class Client {

    public static void main(String[] args) {
        Handler handler = new ConcreteHandler1();

        Request request1 = new Request(1);
        handler.handleRequest(request1);

        System.out.println("==========================");

        Request request2 = new Request(5);
        handler.handleRequest(request2);

        System.out.println("==========================");

        Request request3 = new Request(11);
        handler.handleRequest(request3);
    }
}
