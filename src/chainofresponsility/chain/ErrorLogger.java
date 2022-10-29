package chainofresponsility.chain;

/**
 * @author wei.song
 * @since 2022-10-29 14:21
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
