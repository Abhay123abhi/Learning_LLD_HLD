package lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.Decorator;


import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.BaseClass.Pizza;

public abstract class PizzaDecorator extends Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}
