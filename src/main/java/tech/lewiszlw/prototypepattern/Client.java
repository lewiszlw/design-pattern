package tech.lewiszlw.prototypepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/21
 * Time:14:04
 */
public class Client {

    public static void main(String[] args) {

        Shape clonedShape = ShapeCache.cloneShape(ShapeEnum.Cirlce);
        clonedShape.draw();

        Shape clonedShape2 = ShapeCache.cloneShape(ShapeEnum.Square);
        clonedShape2.draw();
    }
}
