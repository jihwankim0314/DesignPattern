package org.designpattern._03_behavioral._2_internal_behavior._5_visitor_temp.code;

public class ImageFile implements FileElement {
    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(FileVisitor visitor) {
        visitor.visit(this);
    }
}
