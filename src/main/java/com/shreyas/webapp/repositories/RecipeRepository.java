package com.shreyas.webapp.repositories;

import com.shreyas.webapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
