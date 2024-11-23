package org.designpattern._03_behavioral._1_external_communication._7_visitor.code;

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
