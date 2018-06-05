

package Chapter15;

/**
 * This program demonstrates the use of comparator with method references.
 * Using method references is something new with JDK 8
 * @author Adarsh V
 */
import java.util.*;

class MyClass {
    private int val;    
    MyClass(int v) { val = v; }    
    int getVal() { return val; }
}

public class CollectionsComparatorWithMethodRef {
    //A compare method compatible with the one defined by Comparator<T>    
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }    
    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();
        al.add(new MyClass(10));
        al.add(new MyClass(1));
        al.add(new MyClass(8));
        al.add(new MyClass(11));
        al.add(new MyClass(9));
        al.add(new MyClass(20));        
        MyClass maxValObj = Collections.max(al, CollectionsComparatorWithMethodRef::compareMC);
        System.out.println("Maximum : " + maxValObj.getVal());
    }
}
