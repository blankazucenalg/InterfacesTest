package dishes.domain;

import model.Category;
import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azu on 9/04/16.
 */
public class Dish implements Item{
    private int id;
    private String name;
    private List<DishCategory> dishCategories = new ArrayList<>();

    public Dish(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setId(Object id) {
        this.id = (int)id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Category> getCategories() {
        return (List<Category>)(Object)this.dishCategories;
    }


    @Override
    public void setCategories(List<Category> categories) {
        this.dishCategories = (List<DishCategory>)(Object)categories;
    }

    @Override
    public void pushCategory(Category category) {
        this.dishCategories.add((DishCategory) category);
    }

    @Override
    public Category popCategory() {
        return this.dishCategories.remove(this.dishCategories.size());
    }

    @Override
    public String toString(){
        return this.id + ": " + this.name + " Categories: " + this.dishCategories;
    }
}
