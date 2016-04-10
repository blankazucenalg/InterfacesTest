import dishes.domain.Click;
import dishes.domain.Costumer;
import dishes.domain.Dish;
import dishes.domain.DishCategory;
import model.Event;
import movies.domain.Cinephile;
import movies.domain.Movie;
import model.Item;
import movies.domain.MovieCategory;
import movies.domain.Rating;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Dishes
        DishCategory dishCategory = new DishCategory(1, "Dulce", "Sabor");

        Dish dish = new Dish(1, "Pan de naranja con chispas de chocolate");
        dish.pushCategory(dishCategory);

        System.out.println(getItemData(dish));

        Costumer costumer = new Costumer();
        costumer.setId(1);
        costumer.setName("Azucena Lopez");

        Click costumerClickedItem = new Click();
        costumerClickedItem.setItem(dish);
        costumerClickedItem.setUser(costumer);
        costumerClickedItem.setValue(new Date());

        System.out.println(getEventInfo(costumerClickedItem));

        // Movies
        MovieCategory movieCategory = new MovieCategory((long)1, "Infantil", "Género");

        Movie movie = new Movie();
        movie.setId((long)1);
        movie.setName("Megamente");
        movie.setRating(7.8);
        movie.pushCategory(movieCategory);

        System.out.println(getItemData(movie));
        System.out.println(movie);

        Cinephile cinephile = new Cinephile();
        cinephile.setId((long)1);
        cinephile.setName("Azucena Lopez");

        Rating rating = new Rating();
        rating.setItem(movie);
        rating.setUser(cinephile);
        rating.setValue((float)4.0);

        System.out.println(getEventInfo(rating));

    }

    // Example function using only Item reference
    public static String getItemData(Item item){
        return item.getId() + ", \"" + item.getName() + "\", " + item.getCategories();
    }
    public static String getEventInfo(Event event){
        return event.getUser().getName() + " interacted with " + event.getItem().getName() + " (" + event.getValue() + ")";
    }
}
