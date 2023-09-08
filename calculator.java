package org.example;

import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        System.out.println("Enter no. 1 : ");
        Scanner sc=new Scanner(System.in);
        float a= sc.nextInt();
        System.out.println("Enter no. 2 : ");
        float b= sc.nextInt();
        System.out.println("Addition of two numbers is : ");
        System.out.println(a+b);
        System.out.println("Subtraction of two numbers is : ");
        System.out.println(a-b);
        System.out.println("Product of two numbers is : ");
        System.out.println(a*b);
        System.out.println("Division of two numbers is : ");
        System.out.println(a/b);
        System.out.println("Module of two numbers is : ");
        System.out.println(a%b);
    }
}
