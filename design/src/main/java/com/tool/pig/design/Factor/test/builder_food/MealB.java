package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public class MealB extends AbsMeal  {
    @Override
    public String builderFood() {
        return "Beef Burger";
    }

    @Override
    public String builderDrink() {
        return "Big glass of orange juice";
    }
}
