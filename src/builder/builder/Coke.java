package builder.builder;

/**
 * @author wei.song
 * @since 2022-11-03 18:56
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0F;
    }
}
