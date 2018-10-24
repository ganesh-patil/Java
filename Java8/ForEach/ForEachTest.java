package Java8.ForEach;

import java.util.ArrayList;

public class ForEachTest {

    public static void main(String[] args) {
        ArrayList<Entries> entries = new ArrayList<Entries>();
        entries.add(new Entries(1, "127.0.0.0", "firefox"));
        entries.add(new Entries(2, "127.0.0.2", "chrome"));
        entries.add(new Entries(3, "127.0.0.3", "IE"));
        entries.forEach(new Entries(1, "127.0.0.0", "firefox"));
        System.out.println(entries);
        for(Entries entry : entries){
            System.out.println(entry.getIp());
        }

    }
}
