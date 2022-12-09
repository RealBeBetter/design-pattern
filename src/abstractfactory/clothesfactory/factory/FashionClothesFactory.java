package abstractfactory.clothesfactory.factory;

import abstractfactory.clothesfactory.clothes.FashionPants;
import abstractfactory.clothesfactory.clothes.FashionShirt;
import abstractfactory.clothesfactory.clothes.Pants;
import abstractfactory.clothesfactory.clothes.Shirt;

/**
 * @author Real
 * @since 2022/12/9 22:10
 */
public class FashionClothesFactory extends ClothesFactory {
    @Override
    public Shirt createShirt() {
        return new FashionShirt();
    }

    @Override
    public Pants createPants() {
        return new FashionPants();
    }
}
