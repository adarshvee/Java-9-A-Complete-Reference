/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author Adarsh V
 */
public class MyOwnOverrideTest {
    public static void main(String[] args) {
        A a1 = new A();
        a1.test();
        
        A a2 = new B();
        a2.test();
        
        B b1 = new B();
        b1.test();
        
    }
}

class A {
    void test() {
        System.out.println("chapter8.A.test()");
    }
}

class B extends A {
    void test(){
        System.out.println("chapter8.B.test()");
    }
}
