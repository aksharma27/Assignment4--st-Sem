package com.company;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i =1;i<=10;i++){
            int table =1;
            table =i*n;
            System.out.println(n+" X "+i +" = "+ table);
        }

    }
}
