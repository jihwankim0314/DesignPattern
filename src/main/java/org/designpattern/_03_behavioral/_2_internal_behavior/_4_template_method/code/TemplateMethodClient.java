package org.designpattern._03_behavioral._2_internal_behavior._4_template_method.code;

public class TemplateMethodClient {
    public static void main(String[] args) {
        Recipe pasta = new PastaRecipe();
        pasta.cook();

        Recipe friedRice = new FriedRiceRecipe();
        friedRice.cook();
    }
}
