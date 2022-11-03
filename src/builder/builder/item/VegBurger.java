package builder.builder.item;

import builder.builder.design.Burger;

/**
 * @author wei.song
 * @since 2022-11-03 18:54
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0F;
    }
}
