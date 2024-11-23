package org.designpattern._03_behavioral._2_internal_behavior._4_template_method.code;

public class PastaRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("면, 마늘, 올리브유를 준비해봅니다.");
    }

    @Override
    protected void cookDish() {
        System.out.println("올리브유에 마늘을 넣고, 그 사이 면을 삶아봅니다.");
    }
}
