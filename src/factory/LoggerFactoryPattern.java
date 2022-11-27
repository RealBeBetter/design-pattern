package factory;

import factory.logger.*;

/**
 * 日志记录器：记录可能记录到本地硬盘、系统事件、远程服务器等
 * 用户可以选择记录日志到什么地方
 *
 * @author Real
 * Date: 2022/11/27 20:27
 */
public class LoggerFactoryPattern {

    public static void main(String[] args) {
        LoggerFactory loggerFactory = new LoggerFactory();

        Logger logger = loggerFactory.getLogger(new LocalDisk());
        logger.recordLog();

        logger = loggerFactory.getLogger(new SystemEvent());
        logger.recordLog();

        logger = loggerFactory.getLogger(new RemoteServer());
        logger.recordLog();
    }

}
