package decorator.decorator;

/**
 * @author Real
 * Date: 2022/11/24 23:44
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
