package src.PizzaTest;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    List<Order> orders = new ArrayList<Order>();
    PizzaDetails pizzaDetails = PizzaDetails.getObj();

    public boolean saveOrder(Order order ){
        if((((String)pizzaDetails.getSizes().get(order.getSize())).equals(PizzaDetails.sizesData.LARGE.toString()))
                && (((String)pizzaDetails.getCategories().get(order.getCategory())).equals(PizzaDetails.categoriesData.CHEESE_BURST.toString()))) {
            throw new InvalidOrderException("Large pizza not available in cheese-bust category ");
        }
        // save into database
        orders.add(order);
        return true;
    }

    public Order getOrder(){
        return orders.get(orders.size()-1);
    }
}
