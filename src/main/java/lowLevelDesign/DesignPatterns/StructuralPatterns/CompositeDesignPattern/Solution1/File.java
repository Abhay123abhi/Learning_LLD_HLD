package lowLevelDesign.DesignPatterns.StructuralPatterns.CompositeDesignPattern.Solution1;

public class File implements FileSystem{

    String fileName;
    File(String fileName){
        this.fileName=fileName;
    }


    @Override
    public void ls() {
        System.out.println("file name: "+fileName);
    }
}
