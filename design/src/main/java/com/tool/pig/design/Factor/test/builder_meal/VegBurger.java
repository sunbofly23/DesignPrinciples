package com.tool.pig.design.Factor.test.builder_meal;

/**
 * Create by bo.sun on 2019/9/16.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
