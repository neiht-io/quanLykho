/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public  class Shirt extends Item{
    
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    

    public Shirt(String itemCode, String itemName,String color, double itemQuantity, int status, double itemPrice) {
        super(itemCode, itemName, itemQuantity, status, itemPrice);
        this.color=color;
    }

 

    @Override
    public String toString() {
        return "Mã:" + getItemCode()+"  "+ "Áo:"+ getItemName()+"  "+ "Màu:" 
        + color+"  "+ "Số lượng:" + getItemQuantity()+"  "+ "Trạng thái:" + getStatus()+"  "+
                "Giá" + getItemPrice();
    }
    

    
}
