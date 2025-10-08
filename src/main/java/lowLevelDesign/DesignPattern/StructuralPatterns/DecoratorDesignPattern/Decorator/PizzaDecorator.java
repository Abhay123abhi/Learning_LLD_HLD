package lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.Decorator;


import lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern.BaseClass.Pizza;

public abstract class PizzaDecorator extends Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
}

/*in some cases we just hace class does not extend other class
only has a relationship like Vedile has Vehicle stratgey and using Vehicle constructor
it call their methos but in some cases a class like pizza
decorator has a pizza but we nedd to extend the class and call their method why
 */

/* Answer - deep understanding for is -A and Has-A relationship
in some cases we just hace class does not extend other class only has a relationship like Vedile has Vehicle
stratgey and using Vehicle constructor it call their methos but in some cases a class like pizza decorator
has a pizza but we nedd to extend the class and call their method why
 */
