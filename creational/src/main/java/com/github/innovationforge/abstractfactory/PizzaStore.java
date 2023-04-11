package com.github.innovationforge.abstractfactory;

public class PizzaStore {
    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public void orderPizza() {
        Pizza pizza = pizzaFactory.createPizza();

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
