package abstractfactory.shape;

/**
 * @author wei.song
 * @since 2022-10-29 11:23
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
