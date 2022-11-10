package strategy.strategy;

/**
 * @author Song, Wei
 * Date: 2022/7/1 19:33
 */
public interface Strategy {

    /**
     * 运算方法
     *
     * @param num1 数字1
     * @param num2 数字2
     * @return 运算结果
     */
    int doOperation(int num1, int num2);

}
