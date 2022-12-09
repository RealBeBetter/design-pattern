package abstractfactory.clothesfactory.factory;

import abstractfactory.clothesfactory.clothes.Pants;
import abstractfactory.clothesfactory.clothes.Shirt;

/**
 * @author Real
 * @since 2022/12/9 22:07
 */
public abstract class ClothesFactory {
    /**
     * 创建shirt对象
     *
     * @return shirt
     */
    public abstract Shirt createShirt();

    /**
     * 创建pants类
     *
     * @return pants
     */
    public abstract Pants createPants();
}

