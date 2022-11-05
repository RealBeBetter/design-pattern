package prototype.prototype;

/**
 * @author wei.song
 * @since 2022-11-05 16:17
 */
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
