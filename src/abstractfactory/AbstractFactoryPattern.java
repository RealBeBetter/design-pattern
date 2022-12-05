package abstractfactory;

import abstractfactory.abstractfactory.color.Color;
import abstractfactory.abstractfactory.factory.AbstractFactory;
import abstractfactory.abstractfactory.factory.FactoryProducer;
import abstractfactory.abstractfactory.shape.Shape;

/**
 * 我们将创建 Shape 和 Color 接口和实现这些接口的实体类。下一步是创建抽象工厂类 AbstractFactory。
 * 接着定义工厂类 ShapeFactory 和 ColorFactory，这两个工厂类都是扩展了 AbstractFactory。
 * 然后创建一个工厂创造器/生成器类 FactoryProducer。
 * <p>
 * AbstractFactoryPatternDemo 类使用 FactoryProducer 来获取 AbstractFactory 对象。
 * 它将向 AbstractFactory 传递形状信息 Shape（CIRCLE / RECTANGLE / SQUARE），以便获取它所需对象的类型。
 * 同时它还向 AbstractFactory 传递颜色信息 Color（RED / GREEN / BLUE），以便获取它所需对象的类型。
 *
 * @author wei.song
 * @since 2022-10-29 11:43
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        // 获取形状工厂
        AbstractFactory shape = FactoryProducer.getFactory("SHAPE");
        Shape circle = shape.getShape("CIRCLE");
        circle.draw();

        // 获取颜色工厂
        AbstractFactory color = FactoryProducer.getFactory("COLOR");
        Color red = color.getColor("RED");
        red.fill();
    }

}
