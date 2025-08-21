package lowLevelDesign.DecoratorDesignPattern.Decorator;

import lowLevelDesign.DecoratorDesignPattern.BaseClass.Pizza;

public class Mushroom extends PizzaDecorator {

    public Mushroom(Pizza pizza){
        super(pizza);
    }

    @Override
    public double getCost() {
        return pizza.getCost()+175.00;
    }
}
