package model;

/**
 * Created by Leam on 3/10/2018.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
public class Recipe {

    private int id;
    private String name;
    private Set<Ingredient> ingredients;

    private String recipeSteps;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(mappedBy = "recipes")
    public Set<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredient) {
        this.ingredients = ingredients;
    }
}
