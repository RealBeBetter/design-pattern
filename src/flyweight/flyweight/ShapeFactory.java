package flyweight.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 1、系统有大量相似对象。 2、需要缓冲池的场景。
 * 关键代码：使用 Map 存储需要缓存的对象，并使用唯一键进行区分
 *
 * @author Real
 * Date: 2022/11/15 22:56
 */
public class ShapeFactory {

    public static final Map<String, Shape> CIRCLE_MAP = new HashMap<>(8);

    /**
     * 获取 Circle
     *
     * @param color 颜色
     * @return Shape
     */
    public static Shape getCircle(String color) {
        if (color == null || color.isEmpty()) {
            return null;
        }
        Circle circle = (Circle) CIRCLE_MAP.get(color);
        if (circle == null) {
            circle = new Circle(color);
            CIRCLE_MAP.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
