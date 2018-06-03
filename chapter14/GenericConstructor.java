

package chapter14;

/**
 * This class demonstrates the use of generics in a class-constructor. Such 
 * generics can apply even if the class itself is not generic 
 * @author Adarsh V
 */
public class GenericConstructor {
    private double val;
    
    <T extends Number> GenericConstructor(T arg) {
        val = arg.doubleValue();
    }
    void showVal() {
        System.out.println("val : " + val);
    }
    
    public static void main(String[] args) {
        GenericConstructor gc1 = new GenericConstructor(10);
        GenericConstructor gc2 = new GenericConstructor(12.2F);
        
        gc1.showVal();
        gc2.showVal();
    }
}
