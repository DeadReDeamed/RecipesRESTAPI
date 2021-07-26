package com.brugeldev.recipeapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FetchDataService extends JpaRepository<Recipe, Integer> {
    @Override
    List<Recipe> findAll();

    @Query(value = "SELECT * FROM recipes_NL", nativeQuery = true)
    List<Recipe> findAllLanguageNL();

    @Query(value = "SELECT * FROM recipes_ENG", nativeQuery = true)
    List<Recipe> findAllNoLanguage();

    @Query(value = "SELECT * FROM recipes_ENG WHERE LOWER(ingredients) LIKE %?1%", nativeQuery = true)
    List<Recipe> findByIngredientsNoLanguage(String ingredient);

    @Query(value = "SELECT * FROM recipes_ENG WHERE LOWER(title) LIKE %?1%", nativeQuery = true)
    List<Recipe> findByTitleNoLanguage(String title);

    @Query(value = "SELECT * FROM recipes_NL WHERE LOWER(ingredients) LIKE %?1%", nativeQuery = true)
    List<Recipe> findByIngredientsNL(String ingredient);

    @Query(value = "SELECT * FROM recipes_NL WHERE LOWER(title) LIKE %?1%", nativeQuery = true)
    List<Recipe> findByTitleNL(String title);
}
