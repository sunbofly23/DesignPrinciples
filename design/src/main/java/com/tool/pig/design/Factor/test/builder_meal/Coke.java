package com.tool.pig.design.Factor.test.builder_meal;

/**
 * Create by bo.sun on 2019/9/16.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
