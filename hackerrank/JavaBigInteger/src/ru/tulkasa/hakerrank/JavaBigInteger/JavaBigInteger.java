package ru.tulkasa.hakerrank.JavaBigInteger;
import java.io.*;
import java.util.*;
import java.math.BigInteger;
/*
https://www.hackerrank.com/challenges/java-biginteger/problem
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        //int aa = Integer.parseInt(a);
        //int bb = Integer.parseInt(b);
        BigInteger bi1 = new BigInteger(a);
        BigInteger bi2 = new BigInteger(b);
        //BigInteger ab = bi1.add(bi2);
        //BigInteger aa = bi1.multiply(bi2);
        System.out.println(bi1.add(bi2));
        System.out.println(bi1.multiply(bi2));

    }
}
