package com.tool.pig.design.Factor.test.single;

/**
 * Create by bo.sun on 2019/7/15.
 */
public  class SingleObject {


    //private  static  SingleObject intance;

    private SingleObject(){
    }
    //懒汉式-不安全单例
    //线程不安全
    //不支持多线程，稳定性差，不推荐
//    public static SingleObject getIntance(){
//        if(intance ==  null)
//            return new SingleObject();
//
//     return intance;
//    }
//    懒汉式-安全单例
//    线程安全
//    支持多线程，效率较低，不推荐
//    public static synchronized  SingleObject getIntance(){
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
//
//
    public  void showMessage(){
        System.out.print("双检锁-双重校验锁:SingleObject^s output");
    }


}
