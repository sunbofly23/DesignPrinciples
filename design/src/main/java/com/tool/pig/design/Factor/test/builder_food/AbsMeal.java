package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public abstract class AbsMeal {

    ProjectVo vo  =  new ProjectVo();

    public abstract String builderFood();
    public abstract String builderDrink();


    public ProjectVo getMeal(){
        return vo;
    }

}
