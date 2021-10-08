package com.vincent.springboot.strategy.factory.pizzafactory;

import java.util.ArrayList;

/**
 * @author: Vincent
 * @create: 2021-08-21 11:32
 **/
abstract class Pizza {
    String name;
    String dough;  //面团
    String sauce;  //酱油
    ArrayList toppings = new ArrayList();  //佐料

    void prepare() {
        System.out.println("preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding topings...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));

        }

    }


    public void bake() {
        System.out.println("Bake for 25 minutes at 350");

    }

    public void cut() {
        System.out.println("Cutting the pizza into disagonal slices");
    }

    public void box() {
        System.out.println("please pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }
}
