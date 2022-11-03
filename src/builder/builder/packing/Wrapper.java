package builder.builder.packing;

import builder.builder.design.Packing;

/**
 * @author wei.song
 * @since 2022-11-03 18:49
 */
public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
