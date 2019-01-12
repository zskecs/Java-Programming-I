/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zsolt
 */
public class Product {
   
    private String name;
    private int amount;
    private double price;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart) {
        this.amount = amountAtStart;
        this.name = nameAtStart;
        this.price = priceAtStart;
        
    }
    public void printProduct() {
        System.out.println(this.name+this.price+this.amount);
    }
}