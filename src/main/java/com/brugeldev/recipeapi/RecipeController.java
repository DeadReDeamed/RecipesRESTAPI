package com.brugeldev.recipeapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping(value = "/Recipes")
public class RecipeController {

    @Autowired
    FetchDataService fetchDataService;

    @RequestMapping(value = "/getRecipes", params = "ingredients")
    public List<RecipeTable> getRecipesWithIngredients(@RequestParam String ingredients){
        if(ingredients.equals("") || ingredients.isEmpty()){
            return null;
        } else {
            String[] ingredientsSplit = ingredients.split(" ");
            HashSet<RecipeTable> recipes = new HashSet<>();

            for (int i = 0; i < ingredientsSplit.length; i++){
                recipes.addAll(fetchDataService.findByIngredients(ingredientsSplit[i]));
            }
            ArrayList<RecipeTable> recipeList = new ArrayList<>(recipes);
            return recipeList;
        }
    }

    @RequestMapping(value = "/getRecipes", params = "name")
    public List<RecipeTable> getRecipesWithName(@RequestParam String name){
        if(name.equals("") || name.isEmpty()){
            return null;
        } else {
            return fetchDataService.findByTitle(name);
        }
    }

}
