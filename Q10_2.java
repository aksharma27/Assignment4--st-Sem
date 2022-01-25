package com.company;

import java.util.Scanner;

public class Q10_2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in= new Scanner(System.in);
        int N = in.nextInt();           //number of rows
        int i=1;
        while(i<=N){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
