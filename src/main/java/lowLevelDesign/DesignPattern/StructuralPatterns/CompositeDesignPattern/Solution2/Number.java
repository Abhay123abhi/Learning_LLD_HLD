package lowLevelDesign.DesignPattern.StructuralPatterns.CompositeDesignPattern.Solution2;

public class Number implements ArithmeticExpression{
    public int val;
    Number(int val){
        this.val=val;
    }

    @Override
    public int evaluate() {
        System.out.println("Number value is: "+val);
        return val;
    }
}
