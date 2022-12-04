package abstractfactory.abstractfactory.factory;

import abstractfactory.abstractfactory.color.Color;
import abstractfactory.abstractfactory.shape.Circle;
import abstractfactory.abstractfactory.shape.Rectangle;
import abstractfactory.abstractfactory.shape.Shape;
import abstractfactory.abstractfactory.shape.Square;

/**
 * @author wei.song
 * @since 2022-10-29 11:30
 */
public class ShapeFactory extends AbstractFactory {

    public static final String CIRCLE = "CIRCLE";
    public static final String SQUARE = "SQUARE";
    public static final String RECTANGLE = "RECTANGLE";

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape == null || shape.length() == 0) {
            return null;
        }
        if (CIRCLE.equalsIgnoreCase(shape)) {
            return new Circle();
        } else if (SQUARE.equalsIgnoreCase(shape)) {
            return new Square();
        } else if (RECTANGLE.equalsIgnoreCase(shape)) {
            return new Rectangle();
        } else {
            return null;
        }
    }
}
