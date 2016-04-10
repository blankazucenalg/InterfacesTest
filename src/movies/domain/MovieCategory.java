package movies.domain;

import model.Category;

/**
 * Created by azu on 9/04/16.
 */
public class MovieCategory implements Category {
    private long id;
    private String name;
    private String type;

    public MovieCategory(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    @Override
    public Object getId() {
        return this.id;
    }

    @Override
    public void setId(Object id) {
        this.id = (long)id;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return this.id + ": " + this.name + ", " + this.type;
    }
}
