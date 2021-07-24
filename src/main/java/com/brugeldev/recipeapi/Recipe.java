package com.brugeldev.recipeapi;

public class Recipe {
    private String title;
    private String imageURL;
    private int servings;
    private int cookingTime;
    private String foodType;
    private int calories;
    private String ingredients;
    private String instructions;
    private String source;
    private String sourceLink;

    public Recipe(String title, String imageURL, int servings, int cookingTime, String foodType, int calories, String ingredients, String instructions, String source, String sourceLink) {
        this.title = title;
        this.imageURL = imageURL;
        this.servings = servings;
        this.cookingTime = cookingTime;
        this.foodType = foodType;
        this.calories = calories;
        this.ingredients = ingredients;
        this.instructions = instructions;
        this.source = source;
        this.sourceLink = sourceLink;
    }

    public String getTitle() {
        return title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getServings() {
        return servings;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getCalories() {
        return calories;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public String getSource() {
        return source;
    }

    public String getSourceLink() {
        return sourceLink;
    }
}
