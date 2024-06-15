/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class inputcheck {
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         
       
       System.out.println("num 1 is ");
       int num1=input.nextInt();
       
       System.out.println("num 2 is ");
       int num2=input.nextInt();
       
       System.out.println( "num 3 is ");
       int num3=input.nextInt();
       int sum=num1+ num2+ num3;
       System.out.println(" the sum is "+sum);
        
        
        
    }
    
}

