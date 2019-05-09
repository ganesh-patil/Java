package src.PizzaTest;

import java.util.ArrayList;
import java.util.List;

public class PizzaDetails {
    public static  PizzaDetails obj;
    private List sizes = new ArrayList();
    private List categories = new ArrayList();
    private PizzaDetails(){

    }

    public enum sizesData {
        EXTRA_LARGE("Extra large"),
        LARGE("Large"),
        MEDIUM("Medium"),
        SMALL("small")
        ;

        private final String text;
        sizesData(final String text) {
            this.text = text;
        }
        @Override
        public String toString() {
            return text;
        }
    }

    public enum categoriesData {
        PAN("pan"),
        CHEESE_BURST("cheese burst")
        ;

        private final String text;
        categoriesData(final String text) {
            this.text = text;
        }
        @Override
        public String toString() {
            return text;
        }
    }

    public static PizzaDetails getObj(){
        if(obj == null){
            obj = new PizzaDetails();
            for(sizesData value: sizesData.values() ){
                obj.sizes.add((value.toString()));
            }
            for(categoriesData value: categoriesData.values() ){
                obj.categories.add((value.toString()));
            }

        }
        return obj;
    }

    public List getSizes() {
        return sizes;
    }

    public void setSizes(List sizes) {
        this.sizes = sizes;
    }

    public List getCategories() {
        return categories;
    }

    public void setCategories(List categories) {
        this.categories = categories;
    }
}
