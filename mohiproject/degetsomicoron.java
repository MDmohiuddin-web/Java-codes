/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.Scanner;
import java.lang.math;

/**
 *in
 * @author Asus
 */

public class degetsomicoron {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input =new Scanner(System.in);
        System.out.println("input a : ");
        a=input.nextInt();
        
        System.out.println("input b : ");
        b=input.nextInt();
        
        System.out.println("input c : ");
        c=input.nextInt();
        double x,d,x1,x2;
        d=b*b-4*a*c;
        if(d==0)
        {
        x=-b/2*a;
            System.out.println(+x);
            
        }
        else if(d>0)
        {
            x1=-d+math.sqrt(d)/2*a;
            x2=-d+math.sqrt(d)/2*a;
            System.out.println(+x1, +x2);
        }
        else{
        System.out.println("root id");
        }
        
        
    }
    
}
