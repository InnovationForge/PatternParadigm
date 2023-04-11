# Abstract Factory

## Use Case

Let's say we are building a pizza ordering system and we want to be able to create different types of pizzas for different regions of the world. We can use the Abstract Factory pattern to create pizza factories that can create different types of pizzas based on the region.

So First, we define an abstract `Pizza` class and a `PizzaFactory` interface:

```java
public abstract class Pizza {
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}

public interface PizzaFactory {
    public Pizza createPizza();
}
```

Then, we create concrete implementations of the `PizzaFactory` interface for different regions, such as `NewYorkPizzaFactory`, `ChicagoPizzaFactory`, and `CaliforniaPizzaFactory`:

```java
public class NewYorkPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new NewYorkPizza();
    }
}

public class ChicagoPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new ChicagoPizza();
    }
}

public class CaliforniaPizzaFactory implements PizzaFactory {
    public Pizza createPizza() {
        return new CaliforniaPizza();
    }
}

```

Each of these factory classes creates a different type of pizza object that extends the `Pizza` class:

```java

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

```

Finally, we can use the pizza factories to create pizzas for different regions:

```java

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

```


In this example, the `PizzaStore` class uses a `PizzaFactory` object to create different types of pizzas.

## Assignments

* Let's say we are building a car manufacturing system that needs to produce different models of cars, each with their own set of components such as engine, chassis, wheels, and seats. The components for each model can be different, and they may come from different suppliers, but they need to be compatible with each other.
* Let's say we are building a UI component library that includes buttons, checkboxes, and text fields for different operating systems, such as Windows and macOS. We want to make sure that our library is flexible and extensible so that it can support new operating systems in the future without changing the existing code.
* Let's say we're building a restaurant ordering system, and we want to offer different types of menu items depending on the type of restaurant. For example, a Mexican restaurant might have tacos, burritos, and enchiladas on the menu, while an Italian restaurant might have pasta dishes, pizzas, and salads. We want to be able to dynamically create menus for different types of restaurants without having to modify the code that creates the menu items.
