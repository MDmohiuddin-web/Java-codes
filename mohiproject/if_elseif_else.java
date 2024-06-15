/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author Asus
 */
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class if_elseif_else {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        
        int num,num2;
        
       System.out.println("enter num1 = ");
       num=input.nextInt();
       
       System.out.println("enter num2 = ");
       num2=input.nextInt();
       
       if (num>num2)
       {
           System.out.println("the big num is num one : " + num);
           
       }
       else if(num==num2)
               {
                 System.out.println("all equal : "+num );  
               }
               
       else
       {
       System.out.println("the big num is num two : " + num2);
       }
       
        
    }
}