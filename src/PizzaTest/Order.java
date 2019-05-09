package src.PizzaTest;


public class Order {
    private int quantity;
    private int size;
    private int category;

    public Order(int quantity, int size, int category)
    {
        this.quantity = quantity;
        this.size = size;
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }



}
