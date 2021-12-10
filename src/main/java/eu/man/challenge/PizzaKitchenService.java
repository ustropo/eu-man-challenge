package eu.man.challenge;

public class PizzaKitchenService {

  public PizzaKitchenService() {

  }

  public boolean sendOrder(PizzaOrder order) {
    return true;
  }

  public void getStatus(PizzaOrder order) {
    order.setStatus("PREPARING");
  }
}
