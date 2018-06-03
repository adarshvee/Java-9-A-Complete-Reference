

package chapter14;

/**
 *This set of classes demonstrate the use of class hierarchy with generics, and
 * the instance of operator
 * @author Adarsh V
 */

class Parent<T> {
    T obj;
    Parent(T o) {
        obj = o;
    }
    T getObj() {
        return obj;
    }            
}

class Child<T> extends Parent<T> {
    Child(T o) {
        super(o);
    }
}

public class GenericHierarchyAndInstanceOf {
    public static void main(String[] args) {
        Parent<Integer> iOb = new Parent<Integer>(10);
        Child<Integer> iOb2 = new Child<Integer>(100);
        
        Parent<String> sOb = new Parent<String>("Adarsh");
        Child<String> sOb2 = new Child<String>("Hello");
        
        if (iOb2 instanceof Parent<?>) {
            System.out.println("iOb2 instanceof Parent<?>");
        }
        if (iOb2 instanceof Child<?>) {
            System.out.println("iOb2 instanceof Child<?>");
        }
        if (iOb instanceof Parent<?>) {
            System.out.println("iOb instanceof Parent<?>");
        }
        
        if (sOb2 instanceof Parent<?>) {
            System.out.println("sOb2 instanceof Parent<?>");
        }
        
        if (sOb instanceof Parent<?>) {
            System.out.println("sOb instanceof Parent<?>");
        }
        
        if (sOb2 instanceof Child<?>) {
            System.out.println("sOb2 instanceof Child<?>");
        }
    }
}


