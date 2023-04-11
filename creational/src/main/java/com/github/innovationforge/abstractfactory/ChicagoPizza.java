package com.github.innovationforge.abstractfactory;

public class ChicagoPizza extends Pizza {
    public void prepare() {
        System.out.println("Preparing Chicago pizza");
    }

    public void bake() {
        System.out.println("Baking Chicago pizza");
    }

    public void cut() {
        System.out.println("Cutting Chicago pizza");
    }

    public void box() {
        System.out.println("Boxing Chicago pizza");
    }
}
