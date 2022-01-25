package com.company;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in= new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i<=N; i++){
            for (int j =0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

