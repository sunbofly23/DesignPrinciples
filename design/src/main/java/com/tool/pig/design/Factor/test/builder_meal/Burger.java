package com.tool.pig.design.Factor.test.builder_meal;

/**
 * Create by bo.sun on 2019/9/16.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();

}
