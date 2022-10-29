package abstractfactory.factory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

/**
 * @author wei.song
 * @since 2022-10-29 11:28
 */
public abstract class AbstractFactory {

    /**
     * 获取颜色
     *
     * @param color 颜色名称
     * @return Color对象
     */
    public abstract Color getColor(String color);

    /**
     * 获取形状
     *
     * @param shape 形状名称
     * @return Shape对象
     */
    public abstract Shape getShape(String shape);

}
