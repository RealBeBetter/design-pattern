package abstractfactory.abstractfactory.color;

/**
 * @author wei.song
 * @since 2022-10-29 11:26
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
