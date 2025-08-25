package lowLevelDesign.DesignPattern.StructuralPatterns.CompositeDesignPattern.Solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;
    Directory(String directoryName){
        this.directoryName=directoryName;
        fileSystemList= new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory name " + directoryName);
        for(FileSystem fileSystem:fileSystemList){
            fileSystem.ls();
        }
    }
}
