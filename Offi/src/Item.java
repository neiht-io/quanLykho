/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public abstract class Item {
    private String itemCode;
    private String itemName;
    private double itemQuantity;
    private double itemPrice;
    private int status;
    public Item (String itemCode, String itemName, double itemQuantity,int status,  double itemPrice){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.itemQuantity=itemQuantity;
        this.status=status;
        this.itemPrice= itemPrice;
        
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(double itemQuantity) {
        if (itemQuantity >0){
        this.itemQuantity = itemQuantity;}
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        if (itemPrice >0){
        this.itemPrice = itemPrice;
        }
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        if (status > 0 && status <100){ 
        this.status = status;
        }
    }
   
    
    public double total(){
        return itemPrice * itemQuantity;
    }


    
}
