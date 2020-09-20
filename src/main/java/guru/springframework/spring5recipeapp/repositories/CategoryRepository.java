package guru.springframework.spring5recipeapp.repositories;

import guru.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByCategoryName(String categoryName);
}
