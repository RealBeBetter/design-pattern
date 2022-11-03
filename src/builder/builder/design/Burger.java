package builder.builder.design;

import builder.builder.packing.Wrapper;

/**
 * @author wei.song
 * @since 2022-11-03 18:51
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
