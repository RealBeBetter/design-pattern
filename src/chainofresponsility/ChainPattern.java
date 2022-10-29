package chainofresponsility;

import chainofresponsility.chain.AbstractLogger;
import chainofresponsility.chain.ConsoleLogger;
import chainofresponsility.chain.ErrorLogger;

/**
 * @author wei.song
 * @since 2022-10-29 14:23
 */
public class ChainPattern {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger = new ConsoleLogger(AbstractLogger.ERROR);
        // 设置日志等级的传播
        errorLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        // 普通级别只打印一次
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        // debug 级别打印两次
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug level information.");
        // error 级别打印三次
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }

}
