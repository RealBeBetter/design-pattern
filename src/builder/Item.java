package builder;

/**
 * @author wei.song
 * @since 2022-10-29 12:24
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
