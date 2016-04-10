package movies.domain;

import model.Category;
import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by azu on 9/04/16.
 */
public class Movie implements Item{
    public long id;
    public String name;
    public double rating;
    public List<MovieCategory> categories = new ArrayList<>();

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
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
        this.id = (long)id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List<Category> getCategories() {
        return (List<Category>)(Object)this.categories;
    }

    @Override
    public void setCategories(List<Category> categories) {
        this.categories = (List<MovieCategory>)(Object)categories;
    }

    @Override
    public void pushCategory(Category category) {
        this.categories.add((MovieCategory) category);
    }

    @Override
    public Category popCategory() {
        return this.categories.remove(this.categories.size());
    }

    @Override
    public String toString(){
        return this.id + ": " + this.name + ", " + this.rating + ", " + this.categories;
    }
}
