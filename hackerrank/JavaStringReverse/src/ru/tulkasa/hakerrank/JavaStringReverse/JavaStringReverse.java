package ru.tulkasa.hakerrank.JavaStringReverse;
import java.io.*;
import java.util.*;

/*
https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        //java.lang.StringBuffer.reverse(A);
        String B = "";
        int n = A.length();
        for(int i = n - 1; i >= 0; i--)
        {
            B = B + A.charAt(i);
        }
        if (A.equalsIgnoreCase(B)) {
            System.out.println("Yes");
        } else System.out.println("No");

    }
}
