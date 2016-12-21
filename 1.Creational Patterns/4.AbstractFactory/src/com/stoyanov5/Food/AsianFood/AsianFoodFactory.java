package com.stoyanov5.Food.AsianFood;

import com.stoyanov5.Food.Carbohydrate;
import com.stoyanov5.Food.Protein;
import com.stoyanov5.Food.FoodFactory;

/**
 * Created by Krasimir Stoyanov on 21-Dec-16.
 */
public class AsianFoodFactory implements FoodFactory {

    @Override
    public Carbohydrate getCarbohydrate() {
        return new Rice();
    }

    @Override
    public Protein getProtein() {
        return new Egg();
    }
}
