package com.tool.pig.design.Factor.test.single;

/**
 * Create by bo.sun on 2019/7/15.
 */
public  class SingleObject {


    //private  static  SingleObject intance;

    private SingleObject(){
    }
    //饿汉式单例
    //线程不安全
    //不支持多线程，稳定性差，不推荐
//    public static SingleObject getIntance(){
//        if(intance ==  null)
//            return new SingleObject();
//
//     return intance;
//    }
    //lazy单例
    //线程安全
    //支持多线程，效率较低，不推荐
//    public static synchronized   SingleObject getIntance(){
//        if(intance == null)
//            return  new SingleObject();
//
//        return intance;
//    }

    //JDK1.5以后
    //双检锁-双重校验锁
    //线程安全
    //支持多线程，高性能，推荐
    private volatile  static SingleObject intance;

   public static SingleObject getIntance(){
       if(intance == null) {
           synchronized (SingleObject.class) {
               if (intance == null)
                   return new SingleObject();
           }
       }
        return intance;
   }


    public  void showMessage(){
        System.out.printf("SingleObject^s output");
    }


}
