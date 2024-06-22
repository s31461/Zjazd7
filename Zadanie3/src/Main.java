import java.util.HashSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(5, "jabłko"));
        items.add(new Item(6, "banan"));
        items.add(new Item(7, "brzoskwinia"));
        items.add(new Item(8, "gruszka"));
        items.add(new Item(9, "grejpfrut"));
        items.add(new Item(10, "mandarynka"));
        items.add(new Item(11, "pomarancza"));
        items.add(new Item(12, "wiśnia"));
        items.add(new Item(13, "porzeczka"));
        items.add(new Item(14, "multiwitamina"));
        HashSet<Item> itemsSet = new HashSet<>(items.subList(0, 10));
        for (Item item : itemsSet) {
            System.out.println("ID: " + item.id + ", Name: " + item.name);
        }
    }}