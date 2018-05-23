/*
 * Demonstrate For Each on multi dimensional arrays
*/
package Chapter5;
/**
 *
 * @author Adarsh V
 */
public class MultiDForEach {
    public static void main(String[] args) {
        int myArr[][] = new int[4][5];
        
        for (int i = 0; i <4; i ++) {
            for (int j=0; j<5; j++) {
                myArr[i][j] = (i+1) * (j+1);
            }
        }
        
        for (int[] innerArr : myArr) {
            for (int val : innerArr) {
                System.out.println("Value is " + val);
            }
        }
    }
}
