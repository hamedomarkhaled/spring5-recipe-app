package guru.springframework.spring5recipeapp.domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryTest {
    Category category;

    @Before
    public void setUp() {
        category = new Category();
        category.setId(4L);
    }

    @Test
    public void getId() throws Exception{
        Long idValue = 4L;
        assertEquals(idValue, category.getId());
    }

    @Test
    public void getCategoryName() throws Exception{
    }

    @Test
    public void getRecipes() throws Exception{
    }
}