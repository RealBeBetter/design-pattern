package flyweight;

import flyweight.flyweight.Circle;
import flyweight.flyweight.ShapeFactory;

/**
 * 享元模式尝试重用现有的同类对象，如果未找到匹配的对象，则创建新对象。
 * 将通过创建 5 个对象来画出 20 个分布于不同位置的圆来演示这种模式。
 * 由于只有 5 种可用的颜色，所以 color 属性被用来检查现有的 Circle 对象。
 * <p>
 * 用唯一标识码判断，如果在内存中有，则返回这个唯一标识码所标识的对象。
 * 运用共享技术有效地支持大量细粒度的对象。
 * 1、系统有大量相似对象。 2、需要缓冲池的场景。
 *
 * @author Real
 * Date: 2022/11/15 22:52
 */
public class FlyweightPattern {

    private static final String[] COLORS = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLORS[(int) (Math.random() * COLORS.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
