package command.command;

/**
 * @author wei.song
 * @since 2022/12/6 11:31
 */
public class Stock {

    private final String name = "ABC";
    private final int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ] bought ");
    }

    public void sell() {
        System.out.println("Stock [ Name: " + name + ", Quantity:" + quantity + " ] sold ");
    }

}
