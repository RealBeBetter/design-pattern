package abstractfactory.abstractfactory.factory;

import abstractfactory.abstractfactory.color.Blue;
import abstractfactory.abstractfactory.color.Color;
import abstractfactory.abstractfactory.color.Green;
import abstractfactory.abstractfactory.color.Red;
import abstractfactory.abstractfactory.shape.Shape;

/**
 * @author wei.song
 * @since 2022-10-29 11:35
 */
public class ColorFactory extends AbstractFactory {

    public static final String RED = "RED";
    public static final String GREEN = "GREEN";
    public static final String BLUE = "BLUE";

    @Override
    public Color getColor(String color) {
        if (color == null || color.length() == 0) {
            return null;
        }
        if (RED.equalsIgnoreCase(color)) {
            return new Red();
        } else if (GREEN.equalsIgnoreCase(color)) {
            return new Green();
        } else if (BLUE.equals(color)) {
            return new Blue();
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
