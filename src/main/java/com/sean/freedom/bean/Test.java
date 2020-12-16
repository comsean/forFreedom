package com.sean.freedom.bean;

public class Test {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] ints = {1,2,5,89,2,64};
        for (int i : ints) {
            System.out.println("#="+i);
        }


    }
    static String getName(String str){
        int len = str.length();
        return str + ".length=" + len;
    }
}
