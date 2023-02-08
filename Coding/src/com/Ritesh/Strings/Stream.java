package com.Ritesh.Strings;

public class Stream {
    public static void main(String[] args) {
        System.out.println(skipApp("baccappdhhaaak"));
    }
    static void skip(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            skip(p,up.substring(1));
        }else {
            skip(p + ch,up.substring(1));
        }
    }
    static String skipIt(String up){
        if (up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);

        if (ch == 'a'){
            return skipIt(up.substring(1));
        }else {
            return ch + skipIt(up.substring(1));
        }
    }
    static String skipApp(String up){
        if (up.isEmpty()){
            return "";
        }

        if (up.startsWith("app")){
            return skipApp(up.substring(3));
        }else {
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
