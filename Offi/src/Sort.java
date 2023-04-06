
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public class Sort {
    public void sortItemsByQuantity(List<Item> items) {
    Collections.sort(items, new Comparator<Item>() {
        @Override
        public int compare(Item item1, Item item2) {
            return (int) (item1.getItemQuantity() - item2.getItemQuantity());
        }
    });
}
    public void sortItemsByPrice(List<Item> items) {
    Collections.sort(items, new Comparator<Item>() {
        @Override
        public int compare(Item item1, Item item2) {
            return Double.compare(item1.getItemPrice(), item2.getItemPrice());
        }
    });
}
public void sortItemsByName(List<Item> items) {
    Collections.sort(items, new Comparator<Item>() {
        @Override
        public int compare(Item item1, Item item2) {
            return item1.getItemCode().compareTo(item2.getItemCode());
        }
    });
}


}
