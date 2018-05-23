/*
 * A set of classes that demonstrate dynamic message dispatch
 */
package chapter8;

/**
 *
 * @author Adarsh V
 */
public class GeometricalFigureDemo {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(5,5);
        Triangle t = new Triangle(4, 4);
        Figure figref;

        //figref = f;
        //System.out.println(figref.area());
        
        figref = r;
        System.out.println(figref.area());
        
        figref = t;
        System.out.println(figref.area());
    }
    
}

abstract class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
//    double area(){
//        System.out.println("Area for figure is undefined");
//        return 0;
//    }
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    
    @Override
    double area() {
        System.out.println("Area of rectangle");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b){
        super(a,b);
    }
    
    @Override
    double area() {
        System.out.println("Area of Triangle");
        return dim1 * dim2 / 2;
    }
}
