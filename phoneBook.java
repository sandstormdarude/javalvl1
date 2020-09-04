package homework3;

import java.util.HashMap;
import java.util.HashSet;

public class phoneBook {
    HashMap<String, HashSet<String>> pb;

    public phoneBook() {
        this.pb = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }

    public void get(String name) {
        System.out.println("Имя: " + name + ". Телефон: " + pb.getOrDefault(name, new HashSet<>()));
    }
}
