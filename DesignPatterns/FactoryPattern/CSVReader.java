package DesignPatterns.FactoryPattern;

public class CSVReader implements Reader {
    @Override
    public String read() {
        return "CSV file reading";
    }
}
