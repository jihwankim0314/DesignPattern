package org.designpattern._01_creational._1_instance_create_management._2_prototype.code;

public class ReportDocument implements DocumentPrototype {
    private String title;
    private String content;
    // 기타 많은 필드가 있다고 가정

    public ReportDocument(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public DocumentPrototype clone() {
        return new ReportDocument(this.title, this.content);
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeContent(String content) {
        this.content = content;
    }
}
