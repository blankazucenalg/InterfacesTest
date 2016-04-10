package dishes.domain;

import model.Event;
import model.Item;
import model.User;

import java.util.Date;

/**
 * Created by azu on 9/04/16.
 */
public class Click implements Event {
    private Costumer costumer;
    private Dish dish;
    private Date date;

    @Override
    public User getUser() {
        return this.costumer;
    }

    @Override
    public Item getItem() {
        return this.dish;
    }

    @Override
    public Object getValue() {
        return this.date;
    }

    @Override
    public void setUser(User user) {
        this.costumer = (Costumer)user;
    }

    @Override
    public void setItem(Item item) {
        this.dish = (Dish)item;
    }

    @Override
    public void setValue(Object value) {
        this.date = (Date)value;
    }
}
