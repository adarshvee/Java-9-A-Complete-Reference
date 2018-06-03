

package chapter14;

/**
 * This class demonstrates the use of bounded generics. Program to calculate 
 * the average of numeric values
 * @author Adarsh V
 */
public class BoundedTypesExample<T extends Number> {
    T[] nums;
    
    BoundedTypesExample(T[] o) {
        nums = o;
    }
    
    double average() {
        double sum = 0.0;
        for (int i=0; i< nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum/nums.length;
    }
    
    public static void main(String[] args) {
        Integer[] iArr = {1, 2, 3, 4};
        Double[] dArr = {1.2, 4.3, 5.5};
        
        BoundedTypesExample<Integer> iAvg = new BoundedTypesExample<Integer>(iArr);
        System.out.println("Average of integers : " + iAvg.average());
        
        BoundedTypesExample<Double> dAvg = new BoundedTypesExample<Double>(dArr);
        System.out.println("Average of doubles : " + dAvg.average());
    }
}
