package org.designpattern._03_behavioral._2_internal_behavior._5_visitor_temp.code;

public class TextFile implements FileElement {
    private String name;

    public TextFile(String name) {
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
