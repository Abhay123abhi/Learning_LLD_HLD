package lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern;


import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.BaseClass.MargheritaPizza;
import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.BaseClass.Pizza;
import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.Decorator.Mushroom;

public class Main {
    public static void main(String[] args) {

//        Pizza pizza = new Mushroom(new MargheritaPizza()); // base pizza + topping

        Pizza pizza = new MargheritaPizza(); //Base pizza
        System.out.println(pizza.getCost());

        pizza = new Mushroom(pizza); //add topping
        System.out.println(pizza.getCost());

    }
}
