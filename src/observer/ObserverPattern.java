package observer;

import observer.observer.Subject;
import observer.observer.observer.BinaryObserver;
import observer.observer.observer.HexObserver;
import observer.observer.observer.OctalObserver;

/**
 * 当对象间存在一对多关系时，则使用观察者模式（Observer Pattern）。
 * 比如，当一个对象被修改时，则会自动通知依赖它的对象。观察者模式属于行为型模式。
 * 定义对象间的一种一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
 * <p>
 * 观察者模式使用三个类 Subject、Observer 和 Client。
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法。
 * 我们创建 Subject 类、Observer 抽象类和扩展了抽象类 Observer 的实体类。
 *
 * @author Real
 * Date: 2022/11/9 23:55
 */
public class ObserverPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
