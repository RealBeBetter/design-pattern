package strategy;

import strategy.strategy.Context;
import strategy.strategy.OperationAdd;
import strategy.strategy.OperationMultiply;
import strategy.strategy.OperationSubtract;

/**
 * @author Song, Wei
 * Date: 2022/7/1 19:40
 */
public class StrategyPattern {
    public static void main(String[] args) {
        // +
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(10, 5));

        // -
        context = new Context(new OperationSubtract());
        System.out.println(context.executeStrategy(10, 5));

        // ×
        context = new Context(new OperationMultiply());
        System.out.println(context.executeStrategy(10, 5));
    }
}
