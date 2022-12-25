package observer.observer;

/**
 * @author Real
 * @since 2022/12/25 11:46
 */
public abstract class Observer {

    protected Subject subject;

    /**
     * 更新
     */
    public abstract void update();
}
