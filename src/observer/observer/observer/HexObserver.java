package observer.observer.observer;

import observer.observer.Observer;
import observer.observer.Subject;

/**
 * 十六进制 hexadecimal
 *
 * @author Real
 * @since 2022/12/25 11:49
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
