package com.brugeldev.recipeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<RecipeTable, Integer> {
    @Override
    List<RecipeTable> findAll();

    @Query(value = "SELECT * FROM recipes WHERE language_id = ?1", nativeQuery = true)
    List<RecipeTable> findAllByLanguage(String language_id);

    @Query(value = "SELECT * FROM recipes WHERE LOWER(ingredients) LIKE %?1% AND language_id = 'ENG'", nativeQuery = true)
    List<RecipeTable> findByIngredientsNoLanguage(String ingredient);

    @Query(value = "SELECT * FROM recipes WHERE LOWER(title) LIKE %?1% AND language_id = 'ENG'", nativeQuery = true)
    List<RecipeTable> findByTitleNoLanguage(String title);

    @Query(value = "SELECT * FROM recipes WHERE LOWER(ingredients) LIKE %?1% AND language_id = ?2", nativeQuery = true)
    List<RecipeTable> findByIngredients(String ingredient, String language);

    @Query(value = "SELECT * FROM recipes WHERE LOWER(title) LIKE %?1% AND language_id = ?2", nativeQuery = true)
    List<RecipeTable> findByTitle(String title, String language_id);
}
