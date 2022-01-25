package com.company;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i<=N; i++){
            for (int j =1; j<i;j++){
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }
}
