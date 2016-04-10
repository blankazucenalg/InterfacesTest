package movies.domain;

import model.Event;
import model.Item;
import model.User;

/**
 * Created by azu on 9/04/16.
 */
public class Rating implements Event {
    private Cinephile cinephile;
    private Movie movie;
    private float rating;

    @Override
    public User getUser() {
        return this.cinephile;
    }

    @Override
    public Item getItem() {
        return this.movie;
    }

    @Override
    public Object getValue() {
        return this.rating;
    }

    @Override
    public void setUser(User user) {
        this.cinephile = (Cinephile)user;
    }

    @Override
    public void setItem(Item item) {
        this.movie = (Movie)item;
    }

    @Override
    public void setValue(Object value) {
        this.rating = (float)value;
    }
}
