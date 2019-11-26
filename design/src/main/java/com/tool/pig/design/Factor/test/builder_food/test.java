package com.tool.pig.design.Factor.test.builder_food;

/**
 * Create by bo.sun on 2019/7/29.
 */
public class test {
    public static void main(String[] args) {

        MealA  mealA = new MealA();
        MealB  mealB = new MealB();

        KFCwaiter cwaiter = new KFCwaiter();

        cwaiter.setBuilder(mealA);
        ProjectVo vo =  cwaiter.makeDishes();
        //客户点了一份KFC A套餐
        System.out.print("客户A点了一份包含:"+vo.getFood()+"和"+vo.getDrink()+"的A套餐\n");


        cwaiter.setBuilder(mealB);
        ProjectVo vo1 =  cwaiter.makeDishes();
        //客户点了一份KFC A套餐
        System.out.print("客户B点了一份包含:"+vo1.getFood()+"和"+vo1.getDrink()+"的B套餐\n");

    }
}
