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
public class NewClass1 {
    public static void main(String[] args) {
        
        var input =new Scanner(System.in);
       
        System.out.println("Enter num = ");
        int num = input.nextInt();
        
        System.out.println("Enter num 2 = ");
        int num2 = input.nextInt();
        int sum=num+num2;
        System.out.println("The sum is = "+sum);
        
        
    }
    
}
