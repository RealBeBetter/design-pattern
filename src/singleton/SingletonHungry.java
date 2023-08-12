package singleton;

/**
 * 饿汉式
 * 类初始化时就执行对象的创建，容易产生垃圾对象，浪费内存
 * 不会产生线程安全问题，多线程下执行效率可观
 *
 * @author Song, Wei
 * Date: 2022/7/1 20:08
 */
public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();

    private SingletonHungry() {
    }

    public static SingletonHungry getInstance() {
        return INSTANCE;
    }

}
