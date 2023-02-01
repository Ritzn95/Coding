package com.Ritesh.Intro;

public class OddEven {
    public static void main(String[] args) {
        int n = 44;
        System.out.println(IsOdd(n));
    }

    private static boolean IsOdd(int n) {
        return (n & 1) == 1;
    }
}
