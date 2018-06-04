

package Chapter15;

/**
 *This program demonstrates the use of Lambda expressions through a very simple example
 * @author Adarsh V
 */

//One of the two parts of a lambda expression is a function interface
//A functional interface has one and only one abstract method. 
//Note that the methods defined at OBJECT class which are a part of all interfaces
// are not counted here
interface MyNumber {
    double getValue();
}
public class FirstLambdaExpression {
    public static void main(String[] args) {
        //Start with a reference to the functional interface
        MyNumber myNum;
        
        //Assign a lambda expression to the functional interface.
        //The return type, the paramters must match. Any exception thrown by the
        //lambda expression needs to be handles. In our case, we return a constant value
        // This acts as an implementation of the abstract method from functional
       //interface
       myNum = () -> 123.45;
       
       System.out.println("Calling getVal function : " + myNum.getValue());
       
       //Assign a little more complex lambda expression now
       myNum = () -> Math.random() * 100;
       System.out.println("Calling getVal function again with a random val: " + myNum.getValue());
       System.out.println("One more rabdom value: " + myNum.getValue());

       //This won't work because the return type is not compatible
       //myNum = () -> "123";    - ERROR
    }
}
