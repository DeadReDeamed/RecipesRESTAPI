package com.brugeldev.recipeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<RecipeTable, Integer> {
    @Override
    List<RecipeTable> findAll();

    @Query(value = "SELECT * FROM recipes_NL", nativeQuery = true)
    List<RecipeTable> findAllLanguageNL(String language_id);

    @Query(value = "SELECT * FROM recipes_ENG WHERE LOWER(ingredients) LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByIngredientsNoLanguage(String ingredient);

    @Query(value = "SELECT * FROM recipes_ENG WHERE LOWER(title) LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByTitleNoLanguage(String title);

    @Query(value = "SELECT * FROM recipes_NL WHERE LOWER(ingredients) LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByIngredientsNL(String ingredient);

    @Query(value = "SELECT * FROM recipes_NL WHERE LOWER(title) LIKE %?1%", nativeQuery = true)
    List<RecipeTable> findByTitleNL(String title);
}
