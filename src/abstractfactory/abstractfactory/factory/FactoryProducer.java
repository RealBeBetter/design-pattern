package abstractfactory.abstractfactory.factory;

/**
 * @author wei.song
 * @since 2022-10-29 11:39
 */
public class FactoryProducer {

    public static final String COLOR = "COLOR";
    public static final String SHAPE = "SHAPE";

    /**
     * 根据不同的工厂类型，常见不同类型的工厂
     *
     * @param factoryType 工厂类型
     * @return 工厂对象的继承
     */
    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null || factoryType.length() == 0) {
            return null;
        }
        if (factoryType.equalsIgnoreCase(COLOR)) {
            return new ColorFactory();
        } else if (factoryType.equalsIgnoreCase(SHAPE)) {
            return new ShapeFactory();
        } else {
            return null;
        }
    }

}
