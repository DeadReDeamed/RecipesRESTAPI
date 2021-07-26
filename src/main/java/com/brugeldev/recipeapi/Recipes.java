package com.brugeldev.recipeapi;

import java.util.List;

public class Recipes {
    List<Recipe> recipes;

    public Recipes(List<Recipe> recipes){
        this.recipes = recipes;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }
}
