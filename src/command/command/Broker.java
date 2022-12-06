package command.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wei.song
 * @since 2022/12/6 11:33
 */
public class Broker {

    private final List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }

}
