package dishes.domain;

import model.User;

/**
 * Created by azu on 9/04/16.
 */
public class Costumer implements User {
    private int id;
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
        this.id = (int)id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
