package singleton;

/**
 * 懒汉式单例模式
 * 懒加载，且线程安全，实现简单
 * 缺点是多线程环境下性能较低，但是 getInstance() 方法调用也不多
 *
 * @author Song, Wei
 * Date: 2022/7/1 20:05
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
