package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public class MealA extends  AbsMeal {
    @Override
    public String builderFood() {
        return "Chicken Burger";
    }

    @Override
    public String builderDrink() {
        return "Medium Coke";
    }
}
