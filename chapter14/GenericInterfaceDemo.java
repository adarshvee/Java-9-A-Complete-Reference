

package chapter14;

/**
 *This set of classes and interfaces demonstrate the use of generic interfaces
 * @author Adarsh V
 */

interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

//Implementation
class MyClass<T extends Comparable<T>> implements MinMax<T>{
    T[] vals;
    MyClass(T[] o) {
        vals = o;
    }

    public T min() {
        T v = vals[0];
        for (int i=0; i<vals.length; i++) {
            if (vals[i].compareTo(v) < 0 ){v = vals[i];}          
        }
        return v;
    }
    
    public T max() {
        T v = vals[0];
        for (int i=0; i<vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {v = vals[i];}            
        }  
        return v;
    }

}
public class GenericInterfaceDemo {
    
    public static void main(String[] args) {
        Integer inums[] = {3, 6, 2, 8, 6};
        Character ch[] = {'A', 'V', 'D'};

        MyClass<Integer> intClass = new MyClass<Integer>(inums);
        MyClass<Character> cClass = new MyClass<Character>(ch);
        
        System.out.println("Integer Array - Max : " + intClass.max() + " , Min : " + intClass.min());
        System.out.println("Character Array - Max : " + cClass.max() + " , Min : " + cClass.min());
    }
   
   
   
}
