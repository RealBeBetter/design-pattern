package builder.builder.design;

import builder.builder.packing.Bottle;
import builder.builder.packing.Packing;

/**
 * @author wei.song
 * @since 2022-11-03 18:53
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
