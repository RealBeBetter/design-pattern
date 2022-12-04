package factory;

import factory.factory.Shape;
import factory.factory.ShapeFactory;

/**
 * 作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。
 * 有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，
 * 特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。
 * 如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * <p>
 * 核心思想：传入标识或相关的参数，构建复杂对象。
 * 简单的对象构造不一定需要工厂模式，可能反而会过度设计。
 *
 * @author Song, Wei
 * Date: 2022/7/1 19:59
 */
public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("square");
        square.draw();

        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
