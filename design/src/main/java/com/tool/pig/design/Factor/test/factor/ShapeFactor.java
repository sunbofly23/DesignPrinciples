package com.tool.pig.design.Factor.test.factor;

/**
 * Create by bo.sun on 2019/7/10.
 */
public class ShapeFactor {

    public  Shape getObject(String name){
        if(name.isEmpty()){
            return null;
        }
        //忽略大小写比较
        if(name.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        else  if(name.equalsIgnoreCase("SQUARE"))
            return new Square();
        else if(name.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();

        return null;
    }

}
