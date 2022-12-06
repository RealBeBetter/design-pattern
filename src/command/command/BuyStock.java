package command.command;

/**
 * @author wei.song
 * @since 2022/12/6 11:32
 */
public class BuyStock implements Order {
    private final Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
