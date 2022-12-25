package observer.observer.observer;

import observer.observer.Observer;
import observer.observer.Subject;

/**
 * @author Real
 * @since 2022/12/25 11:48
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
