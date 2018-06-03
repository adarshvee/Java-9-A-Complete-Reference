

package chapter14;

/**
 *
 * @author Adarsh V
 */
public class WildcardParamDemo<T extends Number> {
    T[] nums;
    WildcardParamDemo(T[] o) {
        nums = o;
    }
     
    double average(){
        double sum = 0.0;
        for (int i=0; i < nums.length; i++){            
            sum += nums[i].doubleValue();
        }
        return sum;
    }
    
    boolean sameAvg(WildcardParamDemo<?> obj) {
        if (average() == obj.average()) {
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        Integer iNums[] = { 1, 2 ,3, 4, 5};
        WildcardParamDemo<Integer> iOb = new WildcardParamDemo<Integer>(iNums);
        double v = iOb.average();
        System.out.println("Integer average is : " + v);
        
        Double dNums[] = { 1.1, 2.2 ,3.3, 4.4, 5.5};
        WildcardParamDemo<Double> dOb = new WildcardParamDemo<Double>(dNums);
        double d = dOb.average();
        System.out.println("Double average is : " + d);
        
        Float fNums[] = { 1.0F, 2.0F ,3.0F, 4.0F, 5.0F};
        WildcardParamDemo<Float> fOb = new WildcardParamDemo<Float>(fNums);
        double f = fOb.average();
        System.out.println("Float average is : " + f);
        
        System.out.print("Average of integer and double : ");
        System.out.println(iOb.sameAvg(dOb) ? "equal" : "not equal");
        
        System.out.print("Average of integer and float : ");
        System.out.println(iOb.sameAvg(fOb) ? "equal" : "not equal");
    }
}

