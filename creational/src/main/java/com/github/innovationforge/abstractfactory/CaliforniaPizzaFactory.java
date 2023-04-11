package com.github.innovationforge.abstractfactory;

public class CaliforniaPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new CaliforniaPizza();
    }
}
