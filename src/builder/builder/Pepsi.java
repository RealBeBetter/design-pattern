package builder.builder;

/**
 * @author wei.song
 * @since 2022-11-03 18:57
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0F;
    }
}
