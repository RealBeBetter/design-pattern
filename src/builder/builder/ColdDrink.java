package builder.builder;

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
