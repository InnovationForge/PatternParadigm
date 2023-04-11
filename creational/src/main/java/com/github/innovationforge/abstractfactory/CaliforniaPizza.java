package com.github.innovationforge.abstractfactory;

public class CaliforniaPizza extends Pizza {
    public void prepare() {
        System.out.println("Preparing California pizza");
    }

    public void bake() {
        System.out.println("Baking California pizza");
    }

    public void cut() {
        System.out.println("Cutting California pizza");
    }

    public void box() {
        System.out.println("Boxing California pizza");
    }
}