package repository;

/**
 * Created by Leam on 3/10/2018.
 */
import model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
