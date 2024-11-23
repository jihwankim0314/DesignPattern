package org.designpattern._03_behavioral._2_internal_behavior._5_visitor_temp.code;

import java.util.ArrayList;
import java.util.List;

// ObjectStructure (객체 구조) - Element 객체를 관리하며, Visitor를 전달.
public class Document {
    private List<FileElement> files = new ArrayList<>();

    public void addFile(FileElement file) {
        files.add(file);
    }

    public void accept(FileVisitor visitor) {
        for (FileElement file : files) {
            file.accept(visitor);
        }
    }
}
