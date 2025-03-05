
package com.mycompany.mavenproject18;

//Class Definition
public class Class {
    
//   Attributes
    static private int counter;
    
//    Methods
//    Constructors
    Class(){
        counter++;
    }
    
    static public void showCount(){
        System.out.println("Objects created:" + counter);
    }
}
