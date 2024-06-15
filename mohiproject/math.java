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
public class math {public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("enter num one");
        int num=input.nextInt();
        
        System.out.println("enter num two");
        int num2=input.nextInt();
        
        int max = Math.max(num,num2);
        System.out.println("max = "+max);
        
        System.out.println(max);
          int min = Math.min(num,num2);
        
        
        System.out.println("min = "+min);
        
        
}
}
