package factory.framework;

/**
 * @author wei.song
 * @since 2022/12/3 12:08
 */
public class Http implements ServerProtocol {
    @Override
    public void connectToServer() {
        System.out.println("HTTP: connect to server...");
    }
}
