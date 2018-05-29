/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

/**
 *
 * @author Adarsh V
 */

enum Groceries {
    Bread(3.5f), Milk(2f), DHAL(5.6f);
    
    private float price;
    
    Groceries (float p) {
        price = p;
    }
    float getPrice() {
        return price;
    }
}
public class EnumWithValuesDemo {
    public static void main(String[] args) {
        Groceries g;
        g = Groceries.Bread;
        System.out.println("Price of bread : " + g.getPrice());
        for (Groceries g1 : Groceries.values()){
            System.out.println("Item : " + g1 + ", price : " + g1.getPrice());
        }
    }
}
   
