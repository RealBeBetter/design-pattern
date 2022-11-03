package builder.builder.packing;

import builder.builder.design.Packing;

/**
 * @author wei.song
 * @since 2022-11-03 18:50
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
