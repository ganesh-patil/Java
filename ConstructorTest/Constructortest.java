package ConstructorTest;

public class Constructortest {
    int a;
    int b;

    public Constructortest(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void display(){
        System.out.println("Values"+ this.a+"b" + this.b);
    }
    public static void  main(String[] args){
        Constructortest ct = new Constructortest(4, 5);
        ct.display();
    }

}
