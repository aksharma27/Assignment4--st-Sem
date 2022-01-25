package com.company;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t =n;
        int sum =0;
        while (n>0){
            sum = sum+n%10;
            n/=10;
        }
        System.out.println(sum);
        if (sum%9==0){
            System.out.println(t +" is divisible by 9 since the sum of its digits is divisible by 9");
        }
        else
        {
            System.out.println(t+" is not divisible by 9");
        }
    }
}
