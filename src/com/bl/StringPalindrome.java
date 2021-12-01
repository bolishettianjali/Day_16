package com.bl;

import java.util.Scanner;

public class StringPalindrome {
    static String str;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter a string");
        String str=sc.next();
        boolean s=isPalindrome(str);
        System.out.println(s);
    }
    public static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)) {
            return true;
        }
        else {
            return false;
        }

    }

}
