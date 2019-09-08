package ru.tulkasa.hakerrank.JavaLoopsII;

import java.util.*;
import java.io.*;

/*
https://www.hackerrank.com/challenges/java-loops/problem
 */
public class JavaLoopsII {
    public static void main(String []argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                a = (int)((int)a + (int)b*Math.pow(2,i));
                System.out.print(a + " ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
}
