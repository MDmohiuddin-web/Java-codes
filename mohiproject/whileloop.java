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
public class whileloop {
    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         
         
          System.out.println("Enter n value = ");
        int n=input.nextInt();
        
        int i=1;
        while(i<=n){
            System.out.println(i++);
        }
    }
    
}
