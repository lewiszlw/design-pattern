package tech.lewiszlw.builderpattern;

import com.sun.tools.corba.se.idl.constExpr.Or;
import tech.lewiszlw.builderpattern.item.impl.BeefNoodle;
import tech.lewiszlw.builderpattern.item.impl.Beer;
import tech.lewiszlw.builderpattern.item.impl.Burger;
import tech.lewiszlw.builderpattern.item.impl.Milk;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:26
 */
public class OrderBuilder {

    private Order order;

    public OrderBuilder() {
        order = new Order();
    }

    public Order buildBreakfast(Integer num) {
        order.clean();
        for (int i = 0; i < num; i++) {
            order.addItem(new Burger());
            order.addItem(new Milk());
        }
        return order;
    }

    public Order buildLunch(Integer num) {
        order.clean();
        for (int i = 0; i < num; i++) {
            order.addItem(new BeefNoodle());
            order.addItem(new Beer());
        }
        return order;
    }

}
