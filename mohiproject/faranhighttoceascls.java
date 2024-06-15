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
public class faranhighttoceascls {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double cels,farha;
        
        System.out.println("farha ");
        farha=input.nextDouble();
        cels=(farha - 32)* 5/9;
        
        System.out.println("cels is " + cels);
        
        
    }
    
}
