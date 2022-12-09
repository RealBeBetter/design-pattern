package abstractfactory.clothesfactory.factory;

import abstractfactory.clothesfactory.clothes.BusinessPants;
import abstractfactory.clothesfactory.clothes.BusinessShirt;
import abstractfactory.clothesfactory.clothes.Pants;
import abstractfactory.clothesfactory.clothes.Shirt;

/**
 * @author Real
 * @since 2022/12/9 22:08
 */
public class BusinessClothesFactory extends ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new BusinessShirt();
    }

    @Override
    public Pants createPants() {
        return new BusinessPants();
    }
}
