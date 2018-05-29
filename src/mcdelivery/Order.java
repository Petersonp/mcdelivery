/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdelivery;

/**
 *
 * @author Patrick
 */
public class Order {
    private String product;
    private int quantity;
    private int price;
    
    private int basePrice;
    
    private String addons;
    
    

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }
    public String toString(){
        
        
        return quantity+" "+product+" "+addons+" - "+(price)+"php";
        
        
    }
    
    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }
    

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the price
     */
    

    /**
     * @return the finalPrice
     */
    

    /**
     * @return the basePrice
     */
    
    /**
     * @return the addons
     */
    public String getAddons() {
        return addons;
    }

    /**
     * @param addons the addons to set
     */
    public void setAddons(String addons) {
        this.addons = addons;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the basePrice
     */
    public int getBasePrice() {
        return basePrice;
    }

    /**
     * @param basePrice the basePrice to set
     */
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }

    
    
}
