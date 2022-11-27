package factory.logger;

/**
 * @author Real
 * Date: 2022/11/27 20:30
 */
public class LoggerFactory {

    public Logger getLogger(Logger logger) {
        if (logger instanceof RemoteServer) {
            return new RemoteServer();
        } else if (logger instanceof LocalDisk) {
            return new LocalDisk();
        } else if (logger instanceof SystemEvent) {
            return new SystemEvent();
        }
        return null;
    }

}
