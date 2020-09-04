package homework3;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"am", "giving", "you", "night", "call", "call", "tell", "you", "how", "i", "feel"};
        HashMap<String, Integer> nightCall = new HashMap<>();
        for (String x : words) {
            nightCall.put(x, nightCall.getOrDefault(x,0)+1);
        }
        System.out.println(nightCall);

        phoneBook book = new phoneBook();
        book.addContact("Valeriy", "144777");
        book.addContact("Albert", "987567");
        book.addContact("Evgeniy", "707232");
        book.addContact("Benedict", "187987");
        book.addContact("Lambert", "475695");
        book.addContact("Lambert", "149865");

        // ищем по имени
        book.get("Valeriy");
        book.get("Evgeniy");
        book.get("Lambert");
    }
}
