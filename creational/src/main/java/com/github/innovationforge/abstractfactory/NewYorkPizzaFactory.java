package com.github.innovationforge.abstractfactory;

public class NewYorkPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new NewYorkPizza();
    }
}
