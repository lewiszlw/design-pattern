package tech.lewiszlw.builderpattern;

import com.sun.tools.corba.se.idl.constExpr.Or;
import tech.lewiszlw.builderpattern.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/11
 * Time:15:28
 */
public class Order {

    private List<Item> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void clean() {
        items.removeAll(items);
    }

    public float getCost() {
        float cost = 0;
        for(Item item: items) {
            cost += item.getPrice();
        }
        return cost;
    }

    public void showItems() {
        for(Item item: items) {
            System.out.println("Item: " + item.getName() + " " + item.getPrice() + " " + item.getPack());
        }
    }
}
