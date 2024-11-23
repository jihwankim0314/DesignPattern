package org.designpattern._03_behavioral._2_internal_behavior._4_template_method.code;

public abstract class Recipe {
    public final void cook() {
        prepareIngredients();
        cookDish();
        serve();
    }

    private void serve() {
        System.out.println("Serving the dish.");
    }

    protected abstract void prepareIngredients();
    protected abstract void cookDish();
}
