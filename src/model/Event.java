package model;

/**
 * Created by azu on 9/04/16.
 */
public interface Event {
    public User getUser();
    public Item getItem();
    public Object getValue();
    public void setUser(User user);
    public void setItem(Item item);
    public void setValue(Object value);
}
