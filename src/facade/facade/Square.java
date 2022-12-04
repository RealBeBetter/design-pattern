package facade.facade;

/**
 * @author Real
 * Date: 2022/12/4 11:33
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
