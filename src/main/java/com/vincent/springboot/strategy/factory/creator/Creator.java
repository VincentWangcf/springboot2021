package com.vincent.springboot.strategy.factory.creator;

/**
 * @author: Vincent
 * @create: 2021-08-21 16:17
 **/
public abstract class Creator {
    abstract void factoryMethod();
    void anOperation(){
        System.out.println("this is operation...");
    }


}
