package singleton;

/**
 * @author Song, Wei
 * Date: 2022/7/1 18:02
 */
public class SingletonDCL {
    /**
     * DCL 双重检查锁，单例模式
     */
    private volatile static SingletonDCL instance;

    private SingletonDCL() {
    }

    /**
     * 获取单例对象的方法
     * 双重检查锁，指的是 volatile + synchronized 锁，两次 null 检查
     *
     * @return 单例对象
     */
    public static SingletonDCL getSingleton() {
        if (instance == null) {
            // 如果出现多个线程突破第一道检查，最先获取了锁的线程才可以直接实例化对象
            synchronized (SingletonDCL.class) {
                // 第一个线程实例化之后，在实例化过程前/中突破第一道检查的其他线程突破不了第二道检查
                // 可以保证一个线程安全性
                if (instance == null) {
                    instance = new SingletonDCL();
                }
            }
        }
        return instance;
    }

}
