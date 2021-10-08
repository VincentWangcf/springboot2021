package com.vincent.springboot.strategy.factory.pizzafactory;

/**
 * @author: Vincent
 * @create: 2021-08-21 11:31
 **/
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
