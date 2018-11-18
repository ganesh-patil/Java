package Exceptions;

public class ExceptioninInitializerClass {
    public static  int testvar = 10/0; // Exception in thread "main" java.lang.ExceptionInInitializerError // Caused by: java.lang.ArithmeticException: / by zero

    public static void main(String[] args){

    }
}
