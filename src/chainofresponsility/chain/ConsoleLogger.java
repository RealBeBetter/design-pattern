package chainofresponsility.chain;

/**
 * @author wei.song
 * @since 2022-10-29 14:20
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
