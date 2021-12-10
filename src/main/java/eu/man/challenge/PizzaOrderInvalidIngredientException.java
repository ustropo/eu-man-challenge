package eu.man.challenge;

public class PizzaOrderInvalidIngredientException extends RuntimeException {
  public PizzaOrderInvalidIngredientException(String ingredient) {
    super("This ingredient is not accepted: " + ingredient);
  }
}
