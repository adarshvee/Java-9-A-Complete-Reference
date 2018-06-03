

package chapter14;

/**
 *A class that demonstrates the use of multiple parameters to a Generic class
 * @author Adarsh V
 */

class TwoGen<T, V> {
    T obj1;
    V obj2;
    
    TwoGen(T o1, V o2) {
        obj1 = o1;
        obj2 = o2;
    }
    
    void showTypes(){
        System.out.println("Object 1 type " + obj1.getClass().getName());
        System.out.println("Object 2 type " + obj2.getClass().getName());
    }
    
    T getObj1() {
        return obj1;
    }
    
    V getObj2() {
        return obj2;
    }
}
public class DoubleTypeParam {
    public static void main(String[] args) {
        TwoGen<String, Integer> twoG = new TwoGen<String, Integer>("Hey", 123);
        twoG.showTypes();
        String s = twoG.getObj1();
        int i = twoG.getObj2();
        System.out.println("First obj : " + s + " second obj : " + i);
    }
    
}
