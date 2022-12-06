package command.command;

/**
 * @author wei.song
 * @since 2022/12/6 11:33
 */
public class SellStock implements Order {

    private final Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }

}
