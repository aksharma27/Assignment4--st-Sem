package com.company;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        long N = in.nextInt();
        long great = 0;

        for (long i=N; i>=1; i--){
            if ((i&(i-1))==0){
                great = i;
                break;
            }

        }
        System.out.println(great);
    }
}
