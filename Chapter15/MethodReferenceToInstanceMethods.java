

package Chapter15;

/**
 *
 * @author Adarsh V
 */

interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;
    HighTemp(int t) {hTemp = t;}
    
    boolean sameTemp(HighTemp t) {
        return hTemp == t.hTemp;
    }
    
    boolean lessThanTemp(HighTemp t) {
        return hTemp < t.hTemp;
    }    
}

public class MethodReferenceToInstanceMethods {
    //A method that returns the num of occurences of an object for some criteria
    //The criteria is specified by myFunc
    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;
        for (int i=0; i < vals.length; i++) {
            if (f.func(vals[i], v)) count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int count;
        HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(82), new HighTemp(87),
                                    new HighTemp(93), new HighTemp(89)};
        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));
        System.out.println("Days equal to 89 : " + count);
        
        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
        System.out.println("Days less than 89 : " + count);
    }
}
