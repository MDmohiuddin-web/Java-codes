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
//this is how i did this on java

public class numofdivition {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("Enter frist num");
        int num =input.nextInt();
        
         System.out.println("Enter secand num");
        int num2 =input.nextInt();
        
        int sum=num%num2;
        System.out.println("The sum is "+sum);
        
        
    }
    
}
