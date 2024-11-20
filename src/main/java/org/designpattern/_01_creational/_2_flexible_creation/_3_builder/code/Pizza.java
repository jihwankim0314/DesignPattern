package org.designpattern._01_creational._2_flexible_creation._3_builder.code;

//Product
public class Pizza {
    private String size;
    private String source;
    private String topping;

    public Pizza(String size, String source, String topping) {
        this.size = size;
        this.source = source;
        this.topping = topping;
    }
}
