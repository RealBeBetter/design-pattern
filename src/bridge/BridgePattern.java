package bridge;

import bridge.bridge.Circle;
import bridge.bridge.GreenCircle;
import bridge.bridge.RedCircle;
import bridge.bridge.Shape;

/**
 * @author Real
 * Date: 2022/11/7 21:17
 */
public class BridgePattern {

    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
