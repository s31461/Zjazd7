import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
public class Main {
public static void main(String[] args) {
    ArrayList<Item> items = new ArrayList<>();
    items.add(new Item(0, "ołówek"));
    items.add(new Item(1, "długopis"));
    items.add(new Item(2, "pióro"));
    items.add(new Item(3, "gumka"));
    items.add(new Item(4, "linijka"));

    for (int i = 0; i < items.size(); i++) {
        items.get(i).show();
    }
    HashMap<Integer, String> itemsMap = new HashMap<>();
    for (Item item : items) {
        itemsMap.put(item.id, item.name);
    }
    for (Map.Entry<Integer, String> item : itemsMap.entrySet()) {
        System.out.println("ID: " + item.getKey() + ", Name: " + item.getValue());
    }}}