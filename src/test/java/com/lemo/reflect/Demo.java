package com.lemo.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 王兴岭
 * @create 2017-05-27 20:33
 */
public class Demo {

  public Demo(String demo){}
  public Demo(){}


  public static void say(){
    System.out.println("say!");
  }

  public void speak(){
    System.out.println("speak!");
  }

  public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
    //========================调用静态方法 start==========================
    Class<Demo> aClass = Demo.class;
    Method say = aClass.getDeclaredMethod("say",null);
    //通过反射调用静态方法，第一个参数是会被自动忽略的，所以传null即可
    Object sayInvoke = say.invoke(null, null);
    System.out.println("sayInvoke==="+sayInvoke);
    //========================调用静态方法 end=============================


    //=============通过反射调用普通方法 start======================================
    //，第一个参数不能为null而且必须是生命类的实例======
    //=========反例1，如果第一个参数为null start============================
    //Method speak1 = aClass.getDeclaredMethod("speak",null);
    //Object speakInvoke1 = speak1.invoke(null, null);
    //抛出异常 java.lang.NullPointerException
    //System.out.println("speakInvoke==="+speakInvoke1);
    //=========反例1，如果第一个参数为null end==============================

    //=========反例2，如果第一个参数为null start============================
    //Method speak2 = aClass.getDeclaredMethod("speak",null);
   // Object speakInvoke2 = speak2.invoke(aClass, null);
    //抛出异常 java.lang.IllegalArgumentException: object is not an instance of declaring class
    //System.out.println("speakInvoke==="+speakInvoke2);
    //=========反例1，如果第一个参数为null end==============================

    Method speak = aClass.getDeclaredMethod("say",null);

    Demo demo = aClass.newInstance();//调用的是无参构造器，如果类中没有一个无参，也会抛出异常

    Object speakInvoke = speak.invoke(demo, null);
    //输出 speak!
    System.out.println("speakInvoke==="+speakInvoke);
  }
}
