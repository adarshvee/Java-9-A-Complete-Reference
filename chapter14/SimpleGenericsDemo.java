/*
 * A very simple demo of Generics. T is a Type of parameter that will be replaced
by a real type when an object is created.
 */
package chapter14;

/**
 *
 * @author Adarsh V
 */

class Gen<T> {
    T ob; //declare an object of type T
    Gen(T o) {
        ob = o;
    }
    
    T getOb() {
        return ob;
    }
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}
public class SimpleGenericsDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("Value : " + v);
        
        Gen<String> sOb = new Gen<String>("Hello");
        sOb.showType();
        String o = sOb.getOb();
        System.out.println("Value : " + o);
    }
}
