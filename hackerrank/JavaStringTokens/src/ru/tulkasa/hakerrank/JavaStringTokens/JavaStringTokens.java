package ru.tulkasa.hakerrank.JavaStringTokens;
import java.io.*;
import java.util.*;
/*
https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        // Complete the code
        StringTokenizer st = new StringTokenizer(s, " !,?._'@");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        //String patern = ("\\W\\s*");
        //String s1 = s.replaceAll("[\\-\\+\\.\\@\\_\\?\\^:,]","");
        //String patern = ("\\W\\s*");
        //String arr[] = s1.split(patern);
        //System.out.println(arr.length);
        //for(String w:arr){
        //System.out.println(w);
        //}
        scan.close();

    }
}
