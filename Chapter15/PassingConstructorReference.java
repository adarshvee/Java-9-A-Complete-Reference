

package Chapter15;

/**
 * This program demonstrates passing a constructor reference as paramter
 * using className::new
 * @author Adarsh V
 */
interface DemoInterface {
    MyDemoClass func(int n);
}
class MyDemoClass {
    private int val;
    MyDemoClass(int n) {val = n;}
    MyDemoClass() {val = 0;} //This constructor won't be used, but is for demo
    int getVal(){return val;}
}

public class PassingConstructorReference {
    public static void main(String[] args) {
        //Start by assigning method reference to the factory
        //Notice that the parameterless constructor is not used since it does not
        //match the functional interface
        DemoInterface factory = MyDemoClass::new;
        //Now we can use the factory to construct objects
        MyDemoClass mc = factory.func(5);
        System.out.println(mc.getVal());
    }
}
