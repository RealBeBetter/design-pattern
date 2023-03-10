package proxy;

import proxy.proxy.Image;
import proxy.proxy.ProxyImage;

/**
 * 代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。
 * 在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。
 * <p>
 * 将创建一个 Image 接口和实现了 Image 接口的实体类。ProxyImage 是一个代理类，减少 RealImage 对象加载的内存占用。
 * ProxyPatternDemo 类使用 ProxyImage 来获取要加载的 Image 对象，并按照需求进行显示。
 *
 * @author Real
 * Date: 2022/11/21 22:38
 */
public class ProxyPattern {

    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println();
        // 图像不需要从磁盘加载
        image.display();
    }

}
