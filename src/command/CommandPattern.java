package command;

import command.command.Broker;
import command.command.BuyStock;
import command.command.SellStock;
import command.command.Stock;

/**
 * 我们首先创建作为命令的接口 Order，然后创建作为请求的 Stock 类。
 * 实体命令类 BuyStock 和 SellStock，实现了 Order 接口，将执行实际的命令处理。
 * 创建作为调用对象的类 Broker，它接受订单并能下订单。
 * <p>
 * Broker 对象使用命令模式，基于命令的类型确定哪个对象执行哪个命令。
 * CommandPattern 类使用 Broker 类来演示命令模式。
 *
 * @author wei.song
 * @since 2022/12/6 11:30
 */
public class CommandPattern {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}
