package com.Ritesh.Intro;

public class SetBits {
    public static void main(String[] args) {
        int n = 45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n));
    }

    private static int setBit(int n) {
        int count = 0;
        while (n > 0){
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
