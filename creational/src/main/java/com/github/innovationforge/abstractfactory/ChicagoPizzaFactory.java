package com.github.innovationforge.abstractfactory;

public class ChicagoPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new ChicagoPizza();
    }
}
