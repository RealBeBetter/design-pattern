package abstractfactory.abstractfactory.shape;

/**
 * @author wei.song
 * @since 2022-10-29 11:23
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
