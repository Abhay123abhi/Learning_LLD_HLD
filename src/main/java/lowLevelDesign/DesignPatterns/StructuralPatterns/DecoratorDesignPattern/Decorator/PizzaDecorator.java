package lowLevelDesign.DesignPatterns.StructuralPatterns.DecoratorDesignPattern.Decorator;


import lowLevelDesign.DesignPatterns.StructuralPatterns.DecoratorDesignPattern.BaseClass.Pizza;

public abstract class PizzaDecorator extends Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
