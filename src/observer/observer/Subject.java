package observer.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Real
 * @since 2022/12/25 11:45
 */
public class Subject {
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * 附加
     *
     * @param observer 观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
