package com.brugeldev.recipeapi;

import javax.persistence.*;

@Entity
@Table(name = "recipes")
public class RecipeTable {

    @Id
    @Column(name = "id")
    public Long id;

    @Column(name = "language_id")
    public String language;

    @Column(name = "title")
    public String title;

    @Column(name = "imageURL")
    public String imageURL;

    @Column(name = "servings")
    public Integer servings;

    @Column(name = "cookingTime")
    public Integer cookingTime;

    @Column(name = "ofType")
    public String foodType;

    @Column(name = "calories")
    public Integer calories;

    @Column(name = "ingredients")
    public String ingredients;

    @Column(name = "instructions")
    public String instructions;

    @Column(name = "sourceTitle")
    public String source;

    @Column(name = "sourceLink")
    public String sourceLink;

    public RecipeTable(){
        servings = 0;
        calories = 0;
        cookingTime = 0;
    }

    public RecipeTable(Long id, String language, String title, String imageURL, Integer servings, Integer cookingTime, String foodType, Integer calories, String ingredients, String instructions, String source, String sourceLink) {
        this.id = id;
        this.language = language;
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

    public RecipeTable(String language,String title, String imageURL, Integer servings, Integer cookingTime, String foodType, Integer calories, String ingredients, String instructions, String source, String sourceLink) {
        this.language = language;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink;
    }
}
