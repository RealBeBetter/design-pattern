package factory.framework;

/**
 * @author wei.song
 * @since 2022/12/3 12:07
 */
public class Pop3 implements ServerProtocol {
    @Override
    public void connectToServer() {
        System.out.println("POP3: connect to server...");
    }
}
