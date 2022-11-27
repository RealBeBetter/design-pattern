package factory.logger;

/**
 * @author Real
 * Date: 2022/11/27 20:30
 */
public class RemoteServer implements Logger {
    @Override
    public void recordLog() {
        System.out.println("Logger to remote server...");
    }
}
