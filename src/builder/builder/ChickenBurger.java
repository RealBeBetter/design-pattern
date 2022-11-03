package builder.builder;

/**
 * @author wei.song
 * @since 2022-11-03 18:55
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0F;
    }
}
