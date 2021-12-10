package eu.man.challenge;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PizzaOrderInvalidIngredientAdvice {

  @ResponseBody
  @ExceptionHandler(PizzaOrderInvalidIngredientException.class)
  @ResponseStatus(HttpStatus.PRECONDITION_FAILED)
  String invalidIngredientHandler(PizzaOrderInvalidIngredientException ex) {
    return ex.getMessage();
  }
}
