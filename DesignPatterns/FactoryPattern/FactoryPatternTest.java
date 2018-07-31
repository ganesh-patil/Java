package DesignPatterns.FactoryPattern;

public class FactoryPatternTest {
    public static void main(String[] args) {
        System.out.println(ReaderFactory.getReader("XML").read());
        System.out.println(ReaderFactory.getReader("CSV").read());
        System.out.println(ReaderFactory.getReader("DB").read());
    }
}
