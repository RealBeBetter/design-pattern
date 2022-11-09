package bridge.bridge;

/**
 * @author Real
 * Date: 2022/11/9 23:39
 */
public class Circle extends Shape {


    /**
     * 横坐标
     */
    private final int x;
    /**
     * 纵坐标
     */
    private final int y;
    /**
     * 弧度
     */
    private final int radius;

    public Circle(int x, int y, int radius, DrawApi drawApi) {
        super(drawApi);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, x, y);
    }
}
