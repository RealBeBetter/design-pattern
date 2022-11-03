package builder.builder;

import builder.builder.item.ChickenBurger;
import builder.builder.item.Coke;
import builder.builder.item.Pepsi;
import builder.builder.item.VegBurger;

/**
 * 给之前提供的建造项提供可选建造方案
 *
 * @author wei.song
 * @since 2022-11-03 19:00
 */
public class MealBuilder {

    /**
     * 按照一定规则准备 Veg Meal 方案
     *
     * @return Meal对象
     */
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    /**
     * 按照一定规则准备 None Meal 方案
     *
     * @return Meal对象
     */
    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
