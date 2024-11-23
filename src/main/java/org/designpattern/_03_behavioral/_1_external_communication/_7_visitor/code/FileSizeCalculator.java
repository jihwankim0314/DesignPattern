package org.designpattern._03_behavioral._1_external_communication._7_visitor.code;

public class FileSizeCalculator implements FileVisitor {
    @Override
    public void visit(TextFile textFile) {
        System.out.println("Calculating size of text file: " + textFile.getName());
    }

    @Override
    public void visit(ImageFile imageFile) {
        System.out.println("Calculating size of image file: " + imageFile.getName());
    }
}
