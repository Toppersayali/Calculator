package org.example;

import java.util.Scanner;

public class add {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in) ;
       System.out.println( "Enter a number 1 : ");
       int a=sc.nextInt();
       System.out.println( "Enter a number 2 : ");
       int b=sc.nextInt();
       System.out.println( "Enter a number 3 : ");
       int c= sc.nextInt();
       int sum=a+b+c;
       System.out.println("Sum of three numbers is : " + sum);
   }
}
