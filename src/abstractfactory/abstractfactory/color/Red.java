package abstractfactory.abstractfactory.color;

/**
 * @author wei.song
 * @since 2022-10-29 11:25
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
