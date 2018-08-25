package PizzaTest;

public class InvalidOrderException extends RuntimeException {
    public InvalidOrderException(String message){
        super(message);
    }
}
