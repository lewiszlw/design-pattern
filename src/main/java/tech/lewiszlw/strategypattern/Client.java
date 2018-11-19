package tech.lewiszlw.strategypattern;

import tech.lewiszlw.strategypattern.strategy.impl.Add;
import tech.lewiszlw.strategypattern.strategy.impl.Multiply;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/20
 * Time:14:30
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new Add());
        System.out.println(context.executeStrategy(9,11));

        context.setStrategy(new Multiply());
        System.out.println(context.executeStrategy(9, 11));
    }
}
