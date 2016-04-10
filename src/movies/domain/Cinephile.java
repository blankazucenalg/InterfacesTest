package movies.domain;

import model.User;

/**
 * Created by azu on 9/04/16.
 */
public class Cinephile implements User {
    private long id;
    private String name;

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
}
