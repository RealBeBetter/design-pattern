package abstractfactory;

import abstractfactory.abstractfactory.color.Color;
import abstractfactory.abstractfactory.factory.AbstractFactory;
import abstractfactory.abstractfactory.factory.FactoryProducer;
import abstractfactory.abstractfactory.shape.Shape;

/**
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
