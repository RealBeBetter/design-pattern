package abstractfactory.shape;

/**
 * @author wei.song
 * @since 2022-10-29 11:22
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
