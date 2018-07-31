package DesignPatterns.FactoryPattern;

public class DataBaseReader implements Reader {
    @Override
    public String read() {
        return "Reading database";
    }
}
