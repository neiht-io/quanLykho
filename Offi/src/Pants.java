/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khact
 */
public class Pants extends Item {
    private String type;
    private String material;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    

    public Pants(String itemCode, String itemName,   String type, String material, double itemQuantity, int status, double itemPrice) {
        super(itemCode, itemName, itemQuantity, status, itemPrice);
        this.type=type;
        this.material=material;
    }
    
   
    @Override
    public String toString() {
        return "Mã:" + getItemCode()+"  "+ "Quần:"+ getItemName()+"  "+ "Kiểu:" + type +"  "+ "Chất liệu:"+ material +"  "
                + "Số lượng:" + getItemQuantity()+"  "+ "Trạng thái:" 
                + getStatus()+"  "+ "Giá" + getItemPrice();}
    }

    

