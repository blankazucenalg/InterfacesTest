package model;

import dishes.domain.DishCategory;

import java.util.List;

/**
 * Created by azu on 9/04/16.
 */
public interface Item {
    public Object getId();
    public String getName();
    public void setId(Object id);
    public void setName(String name);
    public List<Category> getCategories();
    public void setCategories(List<Category> categories);
    public void pushCategory(Category category);
    public Category popCategory();
}
