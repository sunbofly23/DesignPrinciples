package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public class KFCwaiter {

    private  AbsMeal builder;

    public KFCwaiter() {
    }

    public void setBuilder(AbsMeal builder){
        this.builder = builder;
    }


    //做菜
    public ProjectVo makeDishes(){
        ProjectVo vo = builder.getMeal();

        String food  = builder.builderFood();
        String drink = builder.builderDrink();

        vo.setFood(food);
        vo.setDrink(drink);

        return vo;
    }

}
