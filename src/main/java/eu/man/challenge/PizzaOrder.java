package eu.man.challenge;

import java.util.List;

/**
 *
 */
public class PizzaOrder {

  private long id;
  private String name;
  private List<String> ingredients;
  private String status;

  public PizzaOrder() {

  }

  public PizzaOrder(String name, List<String> ingredients) {
    this.setName(name);
    this.setIngredients(ingredients);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<String> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<String> ingredients) {
    this.ingredients = ingredients;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getStatus() {
    return this.status;
  }
}
