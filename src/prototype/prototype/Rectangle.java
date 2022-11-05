package prototype.prototype;

/**
 * @author wei.song
 * @since 2022-11-05 16:15
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
