package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String s = "";
        for (int i =1; i<=N; i++){
            s = s+i+s;
            System.out.print(s);
            System.out.println(" ");
        }

    }
}
