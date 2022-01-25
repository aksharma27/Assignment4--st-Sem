package com.company;

public class Q7 {
    public static void main(String[] args) {
        long  sum =0;
        long ssum=0;
        for (int i =1; i<=100; i++){
            sum=(long)(sum+(Math.pow(i, 2)));
            ssum = (long) (ssum+i);
        }
        long product =ssum*ssum;
//        System.out.println(sum);
//        System.out.println(product);
        System.out.println("Hence the difference between the sum of the squares of the first hundred natural numbers" +
                "and the squares of the sum is "+product+" - "+sum +" ="+(product-sum));
    }
}
