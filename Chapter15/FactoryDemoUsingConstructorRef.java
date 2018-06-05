

package Chapter15;

/**
 *This program demonstrates a simple factory method using constructor references
 * @author Adarsh V
 */
interface MyFactoryFunc<R, T> {
    R func(T n);
}

class ASimpleClass<T> {
    private T obj;
    ASimpleClass (T v) {obj = v;}
    T getVal() {return obj;}
}

class AnotherSimpleClass {
    String str;
    AnotherSimpleClass(String s) {str = s;}
    String getVal() {return str;}
}
public class FactoryDemoUsingConstructorRef {
    //A factory method for class objects. The class must have a constructor
    //that takes in parameter of type T. R is the type of object being created
    static <R, T> R myClassFactory(MyFactoryFunc<R,T> cons, T v) {
        return cons.func(v);
    } 
    
    public static void main(String[] args) {
        //Assign the constructor to a functional interface, so that we can pass it as a param
        MyFactoryFunc<ASimpleClass<Double>, Double>  myCons1 = ASimpleClass<Double>::new;
        ASimpleClass<Double> mc = myClassFactory(myCons1, 5.9);
        System.out.println("Value from generic class : " + mc.getVal());
        
        MyFactoryFunc<AnotherSimpleClass, String>  myCons2 = AnotherSimpleClass::new;
        AnotherSimpleClass as = myClassFactory(myCons2, "Hey");
        System.out.println("Value from String class : " + as.getVal());
        
    }
}
