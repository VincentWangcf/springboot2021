package com.vincent.springboot.strategy.factory.pizzafactory;

/**
 * @author: Vincent
 * @create: 2021-08-21 14:45
 **/
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")){
            return new NyStypeCheesePizza();
        }   else if(type.equals("veggie")){
//            return NY
        }
        return null;
    }
}
