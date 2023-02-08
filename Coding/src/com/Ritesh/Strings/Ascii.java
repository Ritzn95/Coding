package com.Ritesh.Strings;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {
//        subSeqAscii("", "abc");
        System.out.println(subSeqRetAscii("","abc"));
    }
    static void subSeqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p + (ch + 0),up.substring(1));
    }
    static ArrayList<String> subSeqRetAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList first = subSeqRetAscii(p + ch, up.substring(1));
        ArrayList second = subSeqRetAscii(p,up.substring(1));
        ArrayList third = subSeqRetAscii(p + (ch+0),up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
