package org.designpattern._03_behavioral._2_internal_behavior._4_template_method.code;

public class FriedRiceRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("밥과 기타 볶음밥 재료를 준비해봅니다.");
    }

    @Override
    protected void cookDish() {
        System.out.println("볶아!!!!.");
    }
}
