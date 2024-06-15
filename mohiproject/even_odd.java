/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;


public class even_odd{
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num;
        System.out.println("Enter num = ");
        num = input.nextInt();
        if (num%2==0){
            System.out.println(num+ "Even ");
                    
        }
        else{
            System.out.println(num+ "Odd ");
        }
    }
}
