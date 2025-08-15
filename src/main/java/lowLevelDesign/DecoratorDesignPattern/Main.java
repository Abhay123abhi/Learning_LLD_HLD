package lowLevelDesign.DecoratorDesignPattern;


import lowLevelDesign.DecoratorDesignPattern.BaseClass.MargheritaPizza;
import lowLevelDesign.DecoratorDesignPattern.BaseClass.Pizza;
import lowLevelDesign.DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {

//        Pizza pizza = new Mushroom(new MargheritaPizza()); // base pizza + topping

        Pizza pizza = new MargheritaPizza(); //Base pizza
        System.out.println(pizza.getCost());

        pizza = new Mushroom(pizza); //add topping
        System.out.println(pizza.getCost());

    }
}
