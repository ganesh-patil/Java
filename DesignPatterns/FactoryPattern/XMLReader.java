package DesignPatterns.FactoryPattern;

public class XMLReader implements Reader {
    @Override
    public String read() {
        return "XML file reader";
    }
}
