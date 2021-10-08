package com.vincent.springboot.strategy.factory.pizzafactory;

/**
 * @author: Vincent
 * @create: 2021-08-21 14:32
 * 芝加哥风味的芝士披萨
 **/
public class ChicagoStyleCheesePizza extends Pizza{

    public ChicagoStyleCheesePizza() {
        name ="Chicago Stype Deep Dish  Cheese Pizza";
        dough ="Extra Thick Crust Dough";
        sauce ="Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        //重写cut 方法 切成正方形
        System.out.println("Cutting the pizza into square slices");
    }

}
