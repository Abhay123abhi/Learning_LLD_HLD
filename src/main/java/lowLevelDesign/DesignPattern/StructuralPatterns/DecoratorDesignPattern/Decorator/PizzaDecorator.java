package lowLevelDesign.DecoratorDesignPattern.Decorator;


import lowLevelDesign.DecoratorDesignPattern.BaseClass.Pizza;

public abstract class PizzaDecorator extends Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
