/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author Adarsh V
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(100, 20, 20);
//        myBox.width = 100;
//        myBox.height = 100;
//        myBox.depth = 100;
        //myBox.setDM(100, 20, 20);
        
//        double vol = myBox.width * myBox.height * myBox.depth;
//        System.out.println("Volume is " + vol);
        System.out.print("Volume is ");
        System.out.println(myBox.volume());
                
        
    }
}

class Box {
    double width;
    double height;
    double depth;
    
    double volume() {
        return width * height * depth;
    }
    
//    void setDM(double width, double height, double depth) {
//        this.width = width;
//        this.height = height;
//        this.depth = depth;
//    }
    
    Box(double width, double height, double depth) {
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
