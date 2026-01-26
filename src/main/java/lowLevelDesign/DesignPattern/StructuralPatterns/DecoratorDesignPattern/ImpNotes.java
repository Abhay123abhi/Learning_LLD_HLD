package lowLevelDesign.DesignPattern.StructuralPatterns.DecoratorDesignPattern;

public class ImpNotes {

    /*
    Deep understanding of IS-A amd HAs-A relationship

    IS-A represents inheritance where a subclass can replace the parent
    without breaking behavior, following Liskov Substitution.
    HAS-A represents composition where a class delegates
    responsibility to another class without becoming it.

    e.g -> A Car HAS-A Engine because a car is not an engine.
           A Dog IS-A Animal because it can be used wherever an animal is expected.
     */

    /*
    Why Decorator Design pattern use both IS-A and HAs-A

    IS - A ---> TO maintain same interface
    Has - A -----> To wrap another object
     */
}
