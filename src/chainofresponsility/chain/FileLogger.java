package chainofresponsility.chain;

/**
 * @author wei.song
 * @since 2022-10-29 14:22
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
