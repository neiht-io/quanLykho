
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public class Menu {
    private  Inventory inventory;
    private  Scanner scanner;
    
    public Menu() {
    scanner = new Scanner(System.in);
    inventory = new Inventory();
}

    

    public void displayMenu() {
        int choice;
        do {
            System.out.println("==========MENU==========");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Xóa sản phẩm");
            System.out.println("3. cập nhật sản phẩm");
            System.out.println("4. Tìm kiếm sản phẩm");
            System.out.println("5. Danh sách sản phẩm hiện tại");
            System.out.println("6. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addItem();
                case 2 -> removeItem();
                case 3 -> updateItem();
                case 4 -> searchItem();
                case 5 -> showItemList();
                case 6 -> sortItemList();
                case 7 -> System.out.println("Goobye!");
                default -> System.out.println("Lựa chọn không hợp lệ, mời nhập lại!");
            }

        } while (choice != 6);
}
    
    
    
    
        private void addItem() {
            int pickadd;
            do{
        System.out.print("Nhập 1 để thêm Áo | Nhập 2 để thêm quần:");
                pickadd = scanner.nextInt();
                scanner.nextLine();
        
                }while(pickadd == 1 && pickadd ==2);
            
            if (pickadd ==1){
              System.out.println("Nhập mã áo: ");
              String itemCode = scanner.nextLine();
              System.out.println("Nhập tên áo: ");
              String itemName = scanner.nextLine();
              System.out.println("Nhập màu sắc áo: ");
              String color= scanner.nextLine();
              System.out.println("Nhập số lượng áo: ");
              double itemQuantity = scanner.nextDouble();
              System.out.println("Nhập tình trạng áo: ");
              int status= scanner.nextInt();
              System.out.println("Giá: ");
              double itemPrice =scanner.nextDouble();
              Shirt shirt = new Shirt(itemCode, itemName, color, itemQuantity, status, itemPrice);
              inventory.addShirt(shirt);
              inventory.addclothingList(shirt);
              System.out.println("Thêm áo thành công!");
            }
            if (pickadd ==2){
              System.out.println("Nhập mã quần: ");
              String itemCode = scanner.nextLine();
              System.out.println("Nhập tên quần: ");
              String itemName = scanner.nextLine();
              System.out.println("Nhập kiểu quần: ");
              String type= scanner.nextLine();
              System.out.println("Nhập chất liệu quần: ");
              String material= scanner.nextLine();
              System.out.println("Nhập số lượng quần: ");
              double itemQuantity = scanner.nextDouble();
              System.out.println("Nhập tình trạng: ");
              int status= scanner.nextInt();
              System.out.println("Giá: ");
              double itemPrice =scanner.nextDouble();
              Pants pants = new Pants(itemCode, itemName, type, material, itemQuantity, status, itemPrice);
              inventory.addPants(pants);
              inventory.addclothingList(pants);
              System.out.println("Thêm quần thành công!");
             
            }
        }

    private void showItemList() {
        int pickshow;
            do{
            System.out.println("Nhập 0 để hiển thị cả Quần và Áo.");
            System.out.println("Nhập 1 để hiển thị Áo");
            System.out.println("Nhập 2 để hiển thị quần");
                pickshow = scanner.nextInt();
                scanner.nextLine();
                }while( pickshow == 1 && pickshow ==2  && pickshow ==0);
        if (pickshow ==0){
                List<Item> pantslist = inventory.getAllPantsItems();
                List<Item> shirts = inventory.getAllShirtItems();
                List<Item> clothinglist = inventory.getAllClothingItems();
             if (clothinglist.isEmpty() && pantslist.isEmpty()&& shirts.isEmpty()) {
                 System.out.println("Hiện tại Áo và Quần đang trống!");
             } 
             else {
                 if (shirts.isEmpty()){
                     System.out.println("Hiện tại Áo đang trống!");
                     System.out.println("Danh sánh Quần hiện tại:");
                        for (Item pants : pantslist) {
                            System.out.println(pantslist.toString());
                        }
                 }
                 else if (pantslist.isEmpty()){
                     System.out.println("Hiện tại Quần đang trống!");
                     System.out.println("Danh sánh Áo hiện tại:");
                    for (Item shirt : shirts) {
                    System.out.println(shirts.toString());
                    }
                 }
                 else {
                     System.out.println("Danh sánh Quần và Áo hiện tại:");
                     for (Item clothing : clothinglist) {
                    System.out.println(clothinglist.toString());
                    }
                 }
                        

        }

       }
       if (pickshow ==1){
            List<Item> shirts = inventory.getAllShirtItems();
            if (shirts.isEmpty()) {
                System.out.println("Hiện tại Áo đang trống!");
            } else {
                System.out.println("Danh sánh Áo hiện tại:");
                for (Item shirt : shirts) {
                    System.out.println(shirts.toString());
                }
            }
           }
       if (pickshow ==2){
                List<Item> pantslist = inventory.getAllPantsItems();
             if (pantslist.isEmpty()) {
                 System.out.println("Hiện tại Quần đang trống!");
             } else {
                 System.out.println("Danh sánh Quần hiện tại:");
                 for (Item pants : pantslist) {
                     System.out.println(pantslist.toString());
                 }
             }
       }
       
        
    }

    private void searchItem() {
          
        System.out.println("Gõ mã sản phẩm: ");
        String name = scanner.nextLine();
        Item item = inventory.searchItem(name);

        if (item != null) {
            System.out.println("Sản phẩm bạn cần tìm:");
            System.out.println(item);
        } else {
            System.out.println("Sản phẩm không tồn tại!");
        }

    }
    

        
    private void removeItem() {
        int pickRemove;
        do{
            System.out.println("Nhập 1 để xóa bỏ Áo");
            System.out.println("Nhập 2 để xóa bỏ Quần");
            System.out.println("Mời bạn chọn:");
            pickRemove = scanner.nextInt();
                scanner.nextLine();
        }while (pickRemove ==1 && pickRemove==2);
        
        if(pickRemove ==1){
            System.out.println("Nhập mã Áo bạn muốn loại bỏ: ");
        String id = scanner.nextLine();
        boolean removed = inventory.removeShirt(id);
        if (removed) {
            inventory.removeItem(id);
            System.out.println("Xóa sản phẩm thành công!");
            } else {
            System.out.println("Sản phẩm không tồn tại!");
            }
   
        }
        if(pickRemove==2){
          System.out.println("Nhập mã Quần bạn muốn loại bỏ: ");
        String id = scanner.nextLine();
        boolean removed = inventory.removePants(id);
        if (removed) {
            inventory.removeItem(id);
            System.out.println("Xóa sản phẩm thành công!");
            } else {
            System.out.println("Sản phẩm không tồn tại!");
            }
        }
        
    }



 private void updateItem() {
     int pickupdate;
        do{
            System.out.println("Nhập 1 để cập nhật Áo");
            System.out.println("Nhập 2 để cập nhật Quần");
            System.out.println("Mời bạn chọn:");
            pickupdate = scanner.nextInt();
            scanner.nextLine();
     }while (pickupdate ==1 && pickupdate==2);
        
        
        if(pickupdate==1){
        System.out.println("Nhập mã Áo muốn cập nhật: ");
        String name = scanner.nextLine();
        Item item = inventory.searchShirt(name);

        if (item != null) {
            System.out.println("Nhập số lượng hiện tại: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập giá hiện tại: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            item.setItemQuantity(quantity);
            item.setItemPrice(price);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Mã sản phẩm không tồn tại!");
        }
        }
        
        if(pickupdate==2){
        System.out.println("Nhập mã Quần muốn cập nhật: ");
        String name = scanner.nextLine();
        Item item = inventory.searchPants(name);

        if (item != null) {
            System.out.println("Nhập số lượng hiện tại: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhập giá hiện tại: ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            item.setItemQuantity(quantity);
            item.setItemPrice(price);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Mã sản phẩm không tồn tại!");
        }
        }
    }

    private void sortItemList() {
            int picksort;
             int picklist;
        do{
        System.out.println("Chọn số theo danh sách bạn muốn hiển thị");
        System.out.println("1. Danh sách Áo");
        System.out.println("2. Danh sách Quần");
        System.out.println("0. Danh sách Áo và Quần");
            picklist = scanner.nextInt();
            scanner.nextLine();
     }while (picklist ==1 && picklist==2 && picklist==0);
        
        if(picklist==1){
            do{
                System.out.println("Chọn số theo kiểu bạn muốn sắp xếp:");
                System.out.println("1. Sắp xếp Áo theo giá tiền.");
                System.out.println("2. Sắp xếp Áo theo tên.");
                System.out.println("3. Sắp xếp Áo theo số lượng.");
                picksort = scanner.nextInt();
                scanner.nextLine();
            }while (picksort ==1 && picksort==2 && picksort==3);
            if (picksort==1){

            }
            if(picksort==2){
            
            }
            if(picksort==3){
            
            }
        }
        
        if(picklist==2){
            do{
                System.out.println("Chọn số theo kiểu bạn muốn sắp xếp:");
                System.out.println("1. Sắp xếp Quần theo giá tiền.");
                System.out.println("2. Sắp xếp Quần theo tên.");
                System.out.println("3. Sắp xếp Quần theo số lượng.");
                picksort = scanner.nextInt();
                scanner.nextLine();
            }while (picksort ==1 && picksort==2 && picksort==3);
        
        }
        
        if(picklist==0){
            do{
                System.out.println("Chọn số theo kiểu bạn muốn sắp xếp:");
                System.out.println("1. Sắp xếp Áo, Quần theo giá tiền.");
                System.out.println("2. Sắp xếp Áo, Quần theo tên.");
                System.out.println("3. Sắp xếp Áo, Quần theo số lượng.");
                picksort = scanner.nextInt();
                scanner.nextLine();
            }while (picksort ==1 && picksort==2 && picksort==3);
        
        }
        
        
    }


}
        

    


            
            




