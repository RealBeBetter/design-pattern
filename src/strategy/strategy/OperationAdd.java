package strategy.strategy;

/**
 * @author Song, Wei
 * Date: 2022/7/1 19:36
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
