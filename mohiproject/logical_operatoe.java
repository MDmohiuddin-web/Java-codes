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
public class logical_operatoe {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        
        
        
        System.out.println("Enter num 1 =  ");
        int num=input.nextInt();
        
        System.out.println("Enter num 2 =  ");
        int num2=input.nextInt();
        
        System.out.println("Enter num 3 =  ");
        int num3=input.nextInt();
        
        if (num>num3&&num>num2)
        {
            System.out.println("The big num is num 1  = "+num);
        }
        else if (num2>num&&num2>num3)
        {
            System.out.println("The big num is num 2  = "+num2);
        }
        else if (num3>num&&num3>num2)
        {
            System.out.println("The big num is num 3  = "+num3);
        }
        else
        {
            System.out.println("All equal : ");
        }
        
        
    }
}
