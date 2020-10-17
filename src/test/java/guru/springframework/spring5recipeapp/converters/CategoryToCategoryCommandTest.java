package guru.springframework.spring5recipeapp.converters;

import guru.springframework.spring5recipeapp.commands.CategoryCommand;
import guru.springframework.spring5recipeapp.domain.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CategoryToCategoryCommandTest {
    public static final Long ID_VALUE = new Long(1L);
    public static final String CATEGORY_NAME = "categoryName";

    CategoryToCategoryCommand converter;

    @Before
    public void setUp() throws Exception {
        converter = new CategoryToCategoryCommand();
    }

    @Test
    public void testNullObject() {
        assertNull(converter.convert(null));
    }

    @Test
    public void testEmptyObject() {
        assertNotNull(converter.convert(new Category()));
    }

    @Test
    public void convert() {
        Category category = new Category();
        category.setId(ID_VALUE);
        category.setCategoryName(CATEGORY_NAME);

        CategoryCommand categoryCommand = converter.convert(category);

        assertEquals(ID_VALUE, categoryCommand.getId());
        assertEquals(CATEGORY_NAME, categoryCommand.getCategoryName());

    }
}