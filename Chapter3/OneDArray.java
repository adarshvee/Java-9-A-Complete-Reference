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
public class OneDArray {
    public static void main(String[] args) {
        int months[];
        months = new int[12];
        months[0] = 31;
        months[1] = 28;
        months[2] = 31;
        months[3] = 30;
        months[4] = 31;
        months[5] = 30;
        months[6] = 31;
        months[7] = 31;
        months[8] = 30;
        months[9] = 31;
        months[10] = 30;
        months[11] = 31;
        
        System.out.println("April has " + months[3] + " days.");
        
        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30 , 31, 30, 31};
        System.out.println("May has " + month_days[4] + " days.");
    }
}
