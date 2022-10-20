package factory;

/**
 * @author Song, Wei
 * Date: 2022/7/1 19:55
 */
public class ShapeFactory {
    /**
     * 根据传入工厂数据，生产目标对象
     *
     * @param shape 传入的形状标识
     * @return 工厂生产的对象
     */
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}
