package com.stoyanov5;

import com.stoyanov5.Food.AsianFood.AsianFoodFactory;
import com.stoyanov5.Food.Carbohydrate;
import com.stoyanov5.Food.FoodFactory;
import com.stoyanov5.Food.ItalianFood.ItalianFoodFactory;
import com.stoyanov5.Food.Protein;

public class Main {

    public static void main(String[] args) {
        // Declaration of the first factory
        FoodFactory italianFood = new ItalianFoodFactory();
        Carbohydrate italianMealCarbs = italianFood.getCarbohydrate();
        Protein italianMealProtein = italianFood.getProtein();

        italianMealCarbs.printCarbohydrateOfChoice();
        italianMealProtein.printProteinOfChoice();

        System.out.println();

        // Declaration of the second food factory
        FoodFactory asianFood = new AsianFoodFactory();
        Carbohydrate asianMealCarbs = asianFood.getCarbohydrate();
        Protein asianMealProtein = asianFood.getProtein();

        asianMealCarbs.printCarbohydrateOfChoice();
        asianMealProtein.printProteinOfChoice();
    }
}
