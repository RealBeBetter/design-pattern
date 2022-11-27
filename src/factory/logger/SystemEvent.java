package factory.logger;

/**
 * @author Real
 * Date: 2022/11/27 20:29
 */
public class SystemEvent implements Logger {
    @Override
    public void recordLog() {
        System.out.println("Logger to system event...");
    }
}
