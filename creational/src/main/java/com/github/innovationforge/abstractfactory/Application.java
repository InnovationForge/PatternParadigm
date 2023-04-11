package com.github.innovationforge.abstractfactory;

public class Application {
    public static void main(String[] args) {
        PizzaFactory nyPizzaFactory = new NewYorkPizzaFactory();
        PizzaStore nyPizzaStore = new PizzaStore(nyPizzaFactory);
        nyPizzaStore.orderPizza();

        PizzaFactory chicagoPizzaFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoPizzaStore = new PizzaStore(chicagoPizzaFactory);
        chicagoPizzaStore.orderPizza();

        PizzaFactory californiaPizzaFactory = new CaliforniaPizzaFactory();
        PizzaStore californiaPizzaStore = new PizzaStore(californiaPizzaFactory);
        californiaPizzaStore.orderPizza();
    }
}
