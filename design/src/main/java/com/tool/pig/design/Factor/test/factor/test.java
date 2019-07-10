package com.tool.pig.design.Factor.test.factor;

/**
 * Create by bo.sun on 2019/7/10.
 */
public class test {

    public static void main(String[] args) {
        ShapeFactor factor = new ShapeFactor();

        Shape circle = factor.getObject("circle");
        circle.draw();

        Shape rectangle = factor.getObject("rectangle");
        rectangle.draw();

        Shape square = factor.getObject("square");
        square.draw();
    }
}
