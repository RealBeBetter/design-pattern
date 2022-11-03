package builder;

import builder.builder.Meal;
import builder.builder.MealBuilder;

/**
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
 * 提供各种不同的可选项，但是可以实现不同的建造过程，得到多种建造结果。
 *
 * @author wei.song
 * @since 2022-11-03 18:48
 */
public class BuilderPattern {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}
