package prototype.prototype;

/**
 * @author wei.song
 * @since 2022-11-05 16:16
 */
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
