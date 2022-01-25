package com.company;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum =0;
        int mult=1;
        for (int i =1; i<=N; i++){
            if (i%2==0){
                sum+=i;
            }
            if (i % 2 == 1) {
                mult*=i;
            }
        }
        System.out.println("Sum of all even numbers between 1 to "+N+" = "+sum);
        System.out.println("Product of all even numbers between 1 to "+N +" ="+mult);
    }
}
