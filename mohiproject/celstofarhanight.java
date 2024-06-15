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
public class celstofarhanight {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double cels,farha;
        
        System.out.println("celsius ");
        cels=input.nextDouble();
        farha=1.8*cels+32;
        
        System.out.println("farhanight is "+farha);
        
        
    }
    
}
