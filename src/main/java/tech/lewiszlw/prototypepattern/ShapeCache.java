package tech.lewiszlw.prototypepattern;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei02@meituan.com
 * Date:2018/9/21
 * Time:12:07
 */
public class ShapeCache {

    private static Map<String, Shape> map = new ConcurrentHashMap<>();

    public static Shape cloneShape(ShapeEnum shape) {
        String shapeId = shape.getShapeId();
        Shape cachedShape = map.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    static {
        Circle circle = new Circle();
        circle.setId("1");
        map.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        map.put(square.getId(), square);
    }

}
