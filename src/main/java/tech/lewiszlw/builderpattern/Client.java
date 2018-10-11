package tech.lewiszlw.builderpattern;

import com.sun.tools.corba.se.idl.constExpr.Or;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:20
 */
public class Client {

    public static void main(String[] args) {
        OrderBuilder orderBuilder = new OrderBuilder();

        Order breakfastOrder = orderBuilder.buildBreakfast(1);
        breakfastOrder.showItems();
        System.out.println("Cost: " + breakfastOrder.getCost());

        System.out.println();

        Order lunchOrder = orderBuilder.buildLunch(1);
        lunchOrder.showItems();
        System.out.println("Cost: " + lunchOrder.getCost());
    }
}
