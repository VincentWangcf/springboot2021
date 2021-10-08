package com.vincent.springboot.strategy.factory.pizzafactory;

/**
 * @author: Vincent
 * @create: 2021-08-21 14:44
 **/
public class PizzaTestDrive {
    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan order a"+pizza.getName());


    }
}
