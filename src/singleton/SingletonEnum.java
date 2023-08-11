package singleton;

/**
 * @author wei.song
 * @since 2022-10-25 15:04
 */
public enum SingletonEnum {

    INSTANCE;

    /**
     * 枚举实现的单例是线程安全的，在类加载时就会完成初始化
     * 调用只需要使用SingletonEnum.INSTANCE即可
     */
    public void whateverMethod() {
    }

}
