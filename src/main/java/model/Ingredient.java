package model;

/**
 * Created by Leam on 3/10/2018.
 */

import javax.persistence.*;
import java.util.Set;

@Entity
public class Ingredient {

    private long id;
    private String name;
    private Set<Recipe> recipes;

    public Ingredient() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long newId) {
        this.id = newId;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "ingredient_recipe", joinColumns = @JoinColumn(name = "ingredient_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "recipe_id", referencedColumnName = "id"))
    public Set<Recipe> getAuthors() {
        return recipes;
    }

    public void setRecipes(Set<Recipe> newRecipes){
        this.recipes = newRecipes;
    }

}
