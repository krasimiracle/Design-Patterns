package com.stoyanov5;

import com.stoyanov5.Food.Carbohydrate;
import com.stoyanov5.Food.Protein;

/**
 * Created by Krasimir Stoyanov on 21-Dec-16.
 */
public interface FoodFactory {
    Carbohydrate getCarbohydrate();
    Protein getProtein();
}
