package Java8.ForEach;

import java.util.function.Consumer;

public class Entries implements Consumer<Entries> {

    int id;
    String ip;
    String browser;

    public Entries(int id, String ip, String browser) {
        this.id = id;
        this.ip = ip;
        this.browser = browser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void accept(Entries entry) {
    	System.out.println("Consumer called");
       entry.ip = entry.ip+"," +entry.browser;
    }




}
