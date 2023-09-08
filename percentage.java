package org.example;

import java.util.Scanner;

public class percentage {
    public static void main (String args[]){
        System.out.println("Enter name of student : ");
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        System.out.println("Enter maths marks : ");
        int m1=sc.nextInt();
        System.out.println("Enter chemistry marks : ");
        int m2=sc.nextInt();
        System.out.println("Enter physics marks : ");
        int m3=sc.nextInt();
        float per=((m1+m2+m3)*100/300.0f);
        System.out.println("Percentage of "+a+" "+per+" %");
    }
}
