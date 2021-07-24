package com.brugeldev.recipeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<RecipeTable, Integer> {
    @Override
    List<RecipeTable> findAll();

    @Query(value = "SELECT * FROM recipes WHERE ingredients LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByIngredients(String ingredient);

    @Query(value = "SELECT * FROM recipes WHERE title LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByTitle(String title);
}
