/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Asus
 */
public class superclass_subclass {


class A {
    int x = 40;
    int y = 30;
    
}

class B extends A{
    int sum;
    public void summation(){
        sum = x+y;
        System.out.println("The summation is: "+sum);
    }
}

public class Mavenproject2{
    
    public static void main(String[]args){
        //A obj1 = new A(); // this is not needed
        B obj2 = new B();
        obj2.summation();
        System.out.println("first value: "+obj2.x); // use obj2 instead of obj1
        System.out.println("second value: "+obj2.y);
    }
} 

}

