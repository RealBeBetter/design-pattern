package abstractfactory.abstractfactory.color;

/**
 * @author wei.song
 * @since 2022-10-29 11:27
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
