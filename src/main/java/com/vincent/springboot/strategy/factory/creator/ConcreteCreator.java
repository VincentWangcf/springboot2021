package com.vincent.springboot.strategy.factory.creator;

/**
 * @author: Vincent
 * @create: 2021-08-21 16:19
 **/
public class ConcreteCreator extends Creator implements Product{
    @Override
    void factoryMethod() {
        System.out.println("具体的工厂方法");
    }
}
