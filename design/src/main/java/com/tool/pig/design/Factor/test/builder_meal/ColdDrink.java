package com.tool.pig.design.Factor.test.builder_meal;

/**
 * Create by bo.sun on 2019/9/16.
 */
abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();

}
