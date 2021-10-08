package com.vincent.springboot.strategy.factory.pizzafactory;

/**
 * @author: Vincent
 * @create: 2021-08-21 14:32
 * 定义纽约风味的芝士披萨
 **/
public class NyStypeCheesePizza extends Pizza{

    public NyStypeCheesePizza() {
        name ="NY Stype Sauce and Cheese Pizza";
        dough ="This Crust Dough";
        sauce ="Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
