package org.designpattern._03_behavioral._2_internal_behavior._5_visitor_temp.code;

public interface FileVisitor {
    void visit(TextFile textFile);
    void visit(ImageFile imageFile);
}
