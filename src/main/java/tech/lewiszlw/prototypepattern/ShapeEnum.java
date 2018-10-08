package tech.lewiszlw.prototypepattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/21
 * Time:14:15
 */
public enum ShapeEnum {
    Cirlce("1", "Circle"),
    Square("2", "Square");

    private String shapeId;
    private String type;

    private ShapeEnum(String shapeId, String type) {
        this.shapeId = shapeId;
        this.type = type;
    }

    public String getShapeId() {
        return this.shapeId;
    }

    public String getType() {
        return this.type;
    }
}
