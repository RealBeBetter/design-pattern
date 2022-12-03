package factory;

import factory.framework.*;

/**
 * 设计一个连接服务器的框架，需要三个协议
 * "POP3"、"IMAP"、"HTTP"，可以把这三个作为产品类，共同实现一个接口。
 * 在接口的不同实现累中，传入指定的标识，可以生产出指定的 Factory 生产的对象
 * 指定的标识通常指变量：字符串、对象（用于传不同的对象，而不是直接传 new 出来的即将生产的对象）、基本数据类型（少用）等
 *
 * @author wei.song
 * @since 2022/12/3 12:07
 */
public class ProtocolFactoryPattern {

    public static void main(String[] args) {
        ProtocolFactory protocolFactory = new ProtocolFactory();
        ServerProtocol serverProtocol = protocolFactory.getServerProtocol(new Pop3());
        serverProtocol.connectToServer();

        serverProtocol = protocolFactory.getServerProtocol(new Http());
        serverProtocol.connectToServer();

        serverProtocol = protocolFactory.getServerProtocol(new Imap());
        serverProtocol.connectToServer();
    }

}
