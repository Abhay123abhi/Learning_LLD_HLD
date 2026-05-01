package lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Client;

import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.AbstractFactory.GUIFactory;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.ConcreteFactory.MacFactory;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.ConcreteFactory.WinFactory;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Button;
import lowLevelDesign.DesignPatterns.CreationalPatterns.AbstractFactoryDesignPattern.Product.Checkbox;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckBox();
    }

    public void renderUI(){
        button.render();
        checkbox.check();
    }

    public static void main(String[] args) {
        GUIFactory factory;
        String os = "MAC";
        if(os.equals("WINDOWS")){
            factory = new WinFactory();
        }else{
            factory = new MacFactory();
        }

        Application app = new Application(factory);
        app.renderUI();
    }
}
