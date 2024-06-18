import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items= new ArrayList<>();

        items.add(new Item("Jablko"));
        items.add(new Item("Cola"));
        items.add(new Item("Odrzutowiec"));
        items.add(new Item("Portfel"));
        items.add(new Item("Drabina"));
        items.add(new Item("Gruszka"));
        items.add(new Item("Sprite"));
        items.add(new Item("Kawa"));
        items.add(new Item("Oranzada"));
        items.add(new Item("Biurko1"));
        items.add(new Item("Biurko2"));
        items.add(new Item("Biurko3"));
        items.add(new Item("Biurko4"));
        items.add(new Item("Biurko5"));
        items.add(new Item("Biurko6"));




        HashMap<Integer, String> itemsMap = new HashMap<>();
        for (Item item : items) {

            itemsMap.put(item.getItemID(), item.getItemName());
        }
        for (HashMap.Entry<Integer, String> entry : itemsMap.entrySet()) {

            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());

        }


        List<Item> firstFiveItems = items.subList(0, 5);


        HashSet<Item> itemsSet = new HashSet<>(firstFiveItems);

        for (Item item : itemsSet) {
            System.out.println("ID: " + item.getItemID() + ", Name: " + item.getItemName());
        }
    }














    }
