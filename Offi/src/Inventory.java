
import java.util.AbstractList;
import java.util.ArrayList;
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
public class Inventory {
    public  List<Item> shirtList,pantsList,clothingList;  

    public Inventory() {
        shirtList = new ArrayList<>();
        pantsList = new ArrayList<>(); 
        clothingList=new ArrayList<>();
    }

        
    public void addShirt(Item shirt) {
        shirtList.add(shirt);
    }
    public void addPants(Item pants) {
        pantsList.add(pants);
    }
    public void addclothingList(Item clothing){
        clothingList.add(clothing);
    }
    
    public List<Item> getAllPantsItems() {
        return new ArrayList<>(pantsList);
    }
    
    public List<Item> getAllShirtItems() {
        return new ArrayList<>(shirtList);
    }
    
    public List<Item> getAllClothingItems(){
        return new ArrayList <>(clothingList);
    }
    
        
    public Item searchItem(String codeItem) {
        for (Item clothing : clothingList) {
            if (clothing.getItemCode().equalsIgnoreCase(codeItem)) {
                return clothing;
            }
        }
        return null;
    }
     public Item searchPants(String codePants) {
        for (Item pants : pantsList) {
            if (pants.getItemCode().equalsIgnoreCase(codePants)) {
                return pants;
            }
        }
        return null;
    }
     public Item searchShirt(String codeShirt) {
        for (Item shirt : shirtList) {
            if (shirt.getItemCode().equalsIgnoreCase(codeShirt)) {
                return shirt;
            }
        }
        return null;
    }
    
    
    
        public int removeItem(String codeItem) {
              clothingList.remove(codeItem);
                return 0;
            }

        
        public boolean removeShirt(String shirtId){
         for (Item shirt : shirtList){
         if (shirt.getItemCode().equalsIgnoreCase(shirtId))
             shirtList.remove(shirt);
             return true;
                     }
         return false;
            
        }
        
        public boolean removePants(String pantsId){
         for (Item pants : pantsList){
         if (pants.getItemCode().equalsIgnoreCase(pantsId))
             shirtList.remove(pants);
             return true;
                     }
         return false;
            
        }
        
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
        
    




    

