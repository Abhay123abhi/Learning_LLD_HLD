package lowLevelDesign.DesignPattern.StructuralPatterns.CompositeDesignPattern.ProblemStatement;

public class File {
    String fileName;
    File(String fileName){
        this.fileName=fileName;
    }
    public void ls(){
        System.out.println("FileName: "+fileName);
    }
}
