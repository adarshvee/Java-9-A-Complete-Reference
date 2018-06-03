

package chapter14;

/**
 * Method to determine if an object is a member of an array. Can be used with 
 * any type of object and array, as long as they are compatible
 * @author Adarsh V
 */
public class GenericMethodDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i=0; i< y.length; i++) {
            if (x.equals(y[i])) return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Integer nums[] = {1, 2, 3, 4, 5};
        System.out.println(isIn(2, nums) ? "2 is in nums" : "2 is not in nums");
        System.out.println(isIn(7, nums) ? "7 is in nums" : "7 is not in nums");
        
        String strings[] = {"Adarsh", "Vijayaraghavan", "is", "good", "to", "hire"};
        System.out.println(isIn("is", strings) ? "'is' is in array" : "'is' is not in nums");
        System.out.println(isIn("not", strings) ? "'not' is in nums" : "'not' is not in nums");
    }
}
