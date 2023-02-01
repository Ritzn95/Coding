package com.Ritesh.Easy;

public class Numbers {
    public static void main(String[] args) {
        fun(5);
        fun1(6);
    }

    static void fun(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }
    static void fun1(int n) {
        if (n == 0) {
            return;
        }
        fun1(n - 1);
        System.out.println(n);
    }
}
