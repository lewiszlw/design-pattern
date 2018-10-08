package tech.lewiszlw.simplefactorypattern;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/9/4
 * Time:14:34
 */
public class ShapeFactory {
    private static IShape shape;
    public static IShape getShape(String shapeName) throws Exception {
        switch (shapeName) {
            case "Rectangle":
                shape =  new Rectangle();
                break;
            case "Square":
                shape = new Square();
                break;
            case "Circle":
                shape = new Circle();
                break;
            default:
                throw new Exception("shapeName错误");
        }
        return shape;
    }
}
