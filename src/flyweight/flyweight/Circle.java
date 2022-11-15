package flyweight.flyweight;

/**
 * @author Real
 * Date: 2022/11/15 22:55
 */
public class Circle implements Shape {
    private final String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color +
                ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
