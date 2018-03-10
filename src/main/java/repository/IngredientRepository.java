package repository;

/**
 * Created by Leam on 3/10/2018.
 */


import model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
public interface IngredientRepository extends JpaRepository<Ingredient, Long> {

}


/*
*
package com.hellokoding.restfulapi.repository;

import com.hellokoding.restfulapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer>{
}
* */