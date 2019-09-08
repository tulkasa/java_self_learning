package ru.tulkasa.hakerrank.StringConstruction;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
/*
https://www.hackerrank.com/challenges/string-construction/problem
 */
public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();

            Set<Character> uChars = new HashSet<>();
            for(char c : s.toCharArray())
            {
                uChars.add(c);
            }
            System.out.println(uChars.size());
        }
    }
}
