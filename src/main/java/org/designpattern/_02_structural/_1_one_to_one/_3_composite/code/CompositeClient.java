package org.designpattern._02_structural._1_one_to_one._3_composite.code;

public class CompositeClient {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("file1");
        FileSystemComponent file2 = new File("file2");

        Folder folder1 = new Folder("folder1");
        folder1.addComponent(file1);
        folder1.addComponent(file2);


        folder1.showDetails();
    }
}
