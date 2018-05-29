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
@interface MySecondAnnotation {
    String myStr();
    int myInt();
}
public class AnnotationAndReflectionMethodParam {
    public static void main(String[] args) {
        myMethod("VV", 25);
    }
    
    @MySecondAnnotation(myStr = "Adarsh", myInt = 29)
    public static void myMethod(String str, int i){
        AnnotationAndReflectionMethodParam ob = new AnnotationAndReflectionMethodParam();
        try {
            //Get a class object
            Class<?> c = ob.getClass();
            
            //Get a method object
            Method m = c.getMethod("myMethod", String.class, int.class);
            //get the annotation
            MySecondAnnotation an = m.getAnnotation(MySecondAnnotation.class);
            
            //display the values
            System.out.println(an.myStr() + " " + an.myInt());
                    
        } catch (NoSuchMethodException ex){
            System.out.println("Method not found");
        }
    }
}
