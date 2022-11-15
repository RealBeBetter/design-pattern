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

    public static final Map<String, Shape> circleMap = new HashMap<>(8);

    /**
     * 获取 Circle
     *
     * @param color 颜色
     * @return Shape
     */
    public static Shape getCircle(String color) {
        if (color == null || color.length() == 0) {
            return null;
        }
        Circle circle = (Circle) circleMap.get(color);
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }

}
