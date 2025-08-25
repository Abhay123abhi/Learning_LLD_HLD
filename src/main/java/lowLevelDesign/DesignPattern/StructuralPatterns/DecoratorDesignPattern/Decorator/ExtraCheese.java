package lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.Decorator;

import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.BaseClass.Pizza;

public class ExtraCheese extends PizzaDecorator{

    ExtraCheese(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost()+150.00;
    }
}
