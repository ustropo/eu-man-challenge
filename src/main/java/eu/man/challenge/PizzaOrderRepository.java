package eu.man.challenge;

import java.util.ArrayList;
import java.util.List;

/**
 * This class would connect with database
 */
public class PizzaOrderRepository {

  private List<PizzaOrder> pizzaOrders;

  public PizzaOrderRepository() {
    this.pizzaOrders = new ArrayList<>();
  }

  public PizzaOrder createPizzaOrder(String name, List<String> ingredients) {
    long id = this.pizzaOrders.size() + 1;
    PizzaOrder newOrder = new PizzaOrder(name, ingredients);
    newOrder.setId(id);
    this.pizzaOrders.add(newOrder);
    return newOrder;
  }

  public PizzaOrder getPizzaOrder(long id) {
    return pizzaOrders.stream().filter(po -> po.getId() == id).findAny().orElse(null);
  }
}
