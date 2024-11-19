package org.designpattern._01_creational._1_instance_create_management._2_prototype.code;

public class Client {
    public static void main(String[] args) {
        ReportDocument template = new ReportDocument("reportTitle", "report content");

        ReportDocument copy = (ReportDocument) template.clone();
        copy.changeTitle("copy's title");

    }
}
