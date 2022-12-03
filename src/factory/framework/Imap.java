package factory.framework;

/**
 * @author wei.song
 * @since 2022/12/3 13:11
 */
public class Imap implements ServerProtocol {
    @Override
    public void connectToServer() {
        System.out.println("IMAP: connect to server...");
    }
}
