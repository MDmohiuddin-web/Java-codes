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
public class usingloopfindoutprimenumber {
    public static void main(String[] args) {
        
        Scanner input =new Scanner (System.in);
        
        System.out.println("inter n value ");
        int n=input.nextInt();
        
          for(int x=2;x<=n;x++){
              boolean isprime=true;
              
              for(int i=2;i<=x/2;i++){
              if(x%i==0){
                  isprime=false;
                  break;
              }
              
                  
              }
              if (isprime){
                  System.out.println(x +"");
              
              }

             }

        
             }
      
             }
