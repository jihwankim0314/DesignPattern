package org.designpattern._02_structural._1_one_to_one._3_composite.code;

// Leaf : 개별 객체
public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("file : " + name);
    }
}
