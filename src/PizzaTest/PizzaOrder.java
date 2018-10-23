package PizzaTest;

public class PizzaOrder {

    public static void main(String[] args){
        PizzaDetails pizzaDetails = PizzaDetails.getObj();
        OrderService ors = new OrderService();
        InputProcess ip = new InputProcess();
        try{
            int quantity = ip.getQuantity();
            int size = ip.getPizzaSize();
            int category = ip.getPizzaCategory();
            Order order = new Order(quantity, size, category);

            boolean isSaved = ors.saveOrder(order);
            order = ors.getOrder();
            System.out.println("you have successfully placed order with the following details : ");
            System.out.println(String.valueOf(order.getQuantity())+" "+pizzaDetails.getSizes().get(order.getSize())+" "+pizzaDetails.getCategories().get(order.getCategory()));
        }
        catch (InvalidInputException e){
            System.out.println("Error while input processing: "+e.getMessage());
        }
        catch (InvalidOrderException e){
            System.out.println("Error while processing order: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Input Processing error : "+e.getMessage());
        }


    }
}
