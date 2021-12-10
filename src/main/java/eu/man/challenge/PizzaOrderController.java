package eu.man.challenge;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaOrderController {

  private final PizzaOrderRepository repository;
  private final PizzaKitchenService service;

  public PizzaOrderController() {
    this.repository = new PizzaOrderRepository();
    this.service = new PizzaKitchenService();
  }

  @GetMapping("/order/{id}")
  public PizzaOrder getOrder(@PathVariable Long id) {
    PizzaOrder order = repository.getPizzaOrder(id);
    if (order == null) {
      throw new PizzaOrderNotFoundException(id);
    }

    service.getStatus(order);
    return order;
  }

  @PostMapping("/order/")
  public PizzaOrder createOrder(@RequestBody PizzaOrder order) {
    String invalidIngredient = order.getIngredients().stream()
        .filter(i -> i.toLowerCase().contains("p")).findFirst().orElse(null);

    if (invalidIngredient != null) {
      throw new PizzaOrderInvalidIngredientException(invalidIngredient);
    }

    PizzaOrder newOrder = repository.createPizzaOrder(order.getName(), order.getIngredients());
    service.sendOrder(newOrder);
    service.getStatus(newOrder);
    return newOrder;
  }
}
