package com.Ritesh.Intro;

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fibonacci count: ");
        int n = in.nextInt();
        System.out.println(fibo(n));
    }
    static int fibo(int n){

        return (int)(Math.pow((1 + Math.sqrt(5))/2, n) - Math.pow((1 - Math.sqrt(5))/2, n)/Math.sqrt(5));
    }
}
