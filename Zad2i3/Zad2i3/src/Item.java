import java.util.ArrayList;
import java.util.List;

public class Item {


    public static int licznik=1;

    public int getItemID() {
        return itemID;
    }

    public String getItemName() {
        return itemName;
    }

    private int itemID;
    private String itemName;


    public void Show() {
        System.out.println(itemName);
    }

    public Item(String itemName) {
        this.itemName = itemName;
        this.itemID=licznik++;

    }


    @Override
    public String toString() {
        return "Item: " + itemName + "\n ID: " + itemID;

    }






}
