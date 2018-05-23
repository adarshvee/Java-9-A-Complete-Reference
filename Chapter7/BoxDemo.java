/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author Adarsh V
 */
public class BoxDemo {
    public static void main(String[] args) {
        Box myBox1 = new Box (10, 5, 4);
        Box myBox2 = new Box();
        Box myBox3 = new Box(5);
        
        Box copiedBox = new Box (myBox1);
        
        System.out.println("Volume of box 1 " + myBox1.volume());
        System.out.println("Volume of box 2 " + myBox2.volume());
        System.out.println("Volume of box 3 " + myBox3.volume());
        System.out.println("Volume of copiedBox " + copiedBox.volume());
        
        Box myBoxW = new BoxWeight(10, 12, 11, 13);
        
        
        
    }
}

class Box {
    double width, height, depth;
    Box (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    Box() {
        //-1 to indicate uninitialized box
        width = -1;
        height = -1;
        depth = -1;
    }
    
    Box(Box ref) {
        height = ref.height;
        width = ref.width;
        depth = ref.depth;
    }
    
    Box (double len) {
        width = height = depth = len;   
    }
    
    double volume() {
        return depth * height * width;
    }
}

class BoxWeight extends Box {
        double weight;
        
        BoxWeight(double d, double h, double w, double m) {
//            depth = d;
//            height = h;            
//            width = w;
            super(w, h, d);
            weight = m;
        }
        
        BoxWeight(BoxWeight bx) {
            super(bx);
            weight = bx.weight;
        }
        
        BoxWeight(double l, double m) {
            super(l);
            weight = m;
        }
        BoxWeight() {
            super();
            weight = -1;
        }
}

class ColorBox {
    int color;    
}

class Shipment extends BoxWeight {
    double cost;
    Shipment(Shipment s) {
        super(s);
        cost = s.cost;
    }
    // SO ON
}