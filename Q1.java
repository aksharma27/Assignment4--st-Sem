package com.company;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        System.out.println("Enter your starting integer");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        System.out.println("Enter the ending integer");
        int end = sc.nextInt();
        System.out.println("Enter your step size");
        int size = sc.nextInt();
        for (int i = s; i<= end; i+=size){
            System.out.print(i+" ");
        }

    }
}
