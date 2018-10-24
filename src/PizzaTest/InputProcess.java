package PizzaTest;

import java.util.List;
import java.util.Scanner;

public class InputProcess {
    Scanner in;
    PizzaDetails pizzaDetails;

    public InputProcess(){
        in = new Scanner(System.in);
        pizzaDetails = PizzaDetails.getObj();
    }

    public int getQuantity(){
        System.out.println("Enter Pizza quantity ");
        int quantity = in.nextInt();
        if(quantity <1 ){
            throw new InvalidInputException("Invalid Pizza quantity");
        }
        return quantity;

    }

    public int getPizzaSize(){
        System.out.println("Enter pizza size : ");
        List sizes = pizzaDetails.getSizes();
        for (Object size : sizes){
            System.out.print(sizes.indexOf(size)+":"+(String) size+" ");
        }
        System.out.println();
        int size = in.nextInt();
        if(size >= sizes.size()){
            throw  new InvalidInputException("Invalid Pizza Size");
        }
        return size;
    }

    public int getPizzaCategory(){
        System.out.println("Enter pizza Category : ");
        List categories = pizzaDetails.getCategories();
        for (Object category : categories){
            System.out.print(categories.indexOf(category)+":"+(String) category+" ");
        }
        System.out.println();
        int category = in.nextInt();
        if(category >= categories.size()){
            throw  new InvalidInputException("Invalid Pizza Category");
        }
        return category;
    }
}
