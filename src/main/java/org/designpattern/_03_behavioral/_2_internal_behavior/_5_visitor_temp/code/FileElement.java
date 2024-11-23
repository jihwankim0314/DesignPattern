package org.designpattern._03_behavioral._2_internal_behavior._5_visitor_temp.code;

public interface FileElement {
    void accept(FileVisitor visitor);
}
