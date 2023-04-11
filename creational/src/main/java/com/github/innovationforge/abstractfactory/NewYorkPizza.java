package com.github.innovationforge.abstractfactory;

public class NewYorkPizza extends Pizza {
    public void prepare() {
        System.out.println("Preparing New York pizza");
    }

    public void bake() {
        System.out.println("Baking New York pizza");
    }

    public void cut() {
        System.out.println("Cutting New York pizza");
    }

    public void box() {
        System.out.println("Boxing New York pizza");
    }
}

