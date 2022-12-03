package factory.framework;

/**
 * @author wei.song
 * @since 2022/12/3 12:04
 */
public class ProtocolFactory {

    public ServerProtocol getServerProtocol(ServerProtocol serverProtocol) {
        if (serverProtocol instanceof Http) {
            return new Http();
        } else if (serverProtocol instanceof Imap) {
            return new Imap();
        } else if (serverProtocol instanceof Pop3) {
            return new Pop3();
        } else {
            return null;
        }
    }

}
