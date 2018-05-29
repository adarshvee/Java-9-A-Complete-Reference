/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 *
 * @author Adarsh V
 */
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String myStr();
    int myInt();
}
public class AnnotationAndReflection {
    public static void main(String[] args) {
        myMethod();
    }
    
    @MyAnnotation(myStr = "Adarsh", myInt = 29)
    public static void myMethod(){
        AnnotationAndReflection ob = new AnnotationAndReflection();
        try {
            //Get a class object
            Class<?> c = ob.getClass();
            
            //Get a method object
            Method m = c.getMethod("myMethod");
            //get the annotation
            MyAnnotation an = m.getAnnotation(MyAnnotation.class);
            
            //display the values
            System.out.println(an.myStr() + " " + an.myInt());
                    
        } catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }
}
