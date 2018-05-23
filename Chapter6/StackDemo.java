/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Chapter6;

/**
 *
 * @author Adarsh V
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack st = new Stack();
        int k = st.pop();
        
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(5);
        st.push(7);
        st.push(8);
        st.push(0);
        st.push(10);
        st.push(11);
        st.push(12);
        st.push(44);
        
        k = st.pop();
        System.out.println("k is " + k);
        
        k = st.pop();
        System.out.println("k is " + k);
        
        
    }
    
    
}
