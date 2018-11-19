package tech.lewiszlw.strategypattern.strategy.impl;

import tech.lewiszlw.strategypattern.strategy.Strategy;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/7/20
 * Time:14:23
 */
public class Add implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
