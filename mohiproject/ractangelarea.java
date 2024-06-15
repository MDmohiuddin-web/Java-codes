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
public class ractangelarea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double base,heght,area;
        
        System.out.print("Enter base = ");
        base=input.nextDouble();
        
        System.out.print("Enter heght = ");
        heght=input.nextDouble();
        
        area=0.5*base*heght;
        System.out.println("area of tringle "+area);
    }
    
}
