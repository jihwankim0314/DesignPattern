package org.designpattern._03_behavioral._1_external_communication._7_visitor.code;

public interface FileElement {
    void accept(FileVisitor visitor);
}
