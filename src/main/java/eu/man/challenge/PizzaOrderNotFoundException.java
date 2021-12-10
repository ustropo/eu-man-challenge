package eu.man.challenge;

public class PizzaOrderNotFoundException extends RuntimeException {
  public PizzaOrderNotFoundException(long id) {
    super("Could not find order " + id);
  }
}
