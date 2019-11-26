package com.tool.pig.design.Factor.test.builder_meal;

/**
 * Create by bo.sun on 2019/9/16.
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
