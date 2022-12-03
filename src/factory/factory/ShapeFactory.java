package factory.factory;

/**
 * @author Song, Wei
 * Date: 2022/7/1 19:55
 */
public class ShapeFactory {

    public static final String RECTANGLE = "RECTANGLE";
    public static final String SQUARE = "SQUARE";
    public static final String CIRCLE = "CIRCLE";

    /**
     * 根据传入工厂数据，生产目标对象
     *
     * @param shape 传入的形状标识
     * @return 工厂生产的对象
     */
    public Shape getShape(String shape) {
        if (RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else if (SQUARE.equalsIgnoreCase(shape)) {
            return new Square();
        } else if (CIRCLE.equalsIgnoreCase(shape)) {
            return new Circle();
        }
        return null;
    }
}
