/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author Adarsh V
 */
public class twoDArray {
    public static void main(String[] args) {
        int twoD[][] = new int[4][5];
        int k = 1;
        for (int i=0; i<4; i++)
        {
            for (int j = 0; j<4; j++)
            {
                twoD[i][j] = k++;
            }
        }
        
        for (int i=0; i<4; i++)
        {
            for (int j = 0; j<4; j++)
            {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
