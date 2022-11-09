package bridge.bridge;

/**
 * 通过关键性的桥接抽象类，将 DrawApi 类型对象注入到抽象类中，实现对象的桥接。
 * 将抽象部分与实现部分分离，使它们都可以独立的变化。
 *
 * @author Real
 * Date: 2022/11/9 23:38
 */
public abstract class Shape {

    protected DrawApi drawApi;

    /**
     * 构造方法注入接口
     *
     * @param drawApi drawApi接口
     */
    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();

}
