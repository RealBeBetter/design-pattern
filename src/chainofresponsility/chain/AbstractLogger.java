package chainofresponsility.chain;

/**
 * 用责任链表示日志级别的日志模型
 *
 * @author wei.song
 * @since 2022-10-29 14:13
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    /**
     * 打日志方法
     *
     * @param level   日志级别
     * @param message 日志信息
     */
    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }


    /**
     * 写日志方法
     *
     * @param message 日志信息
     */
    protected abstract void write(String message);


}
