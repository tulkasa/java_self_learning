package ru.tulkasa.hakerrank.JavaIDArray;
import java.util.*;
/*
https://www.hackerrank.com/challenges/java-1d-array-introduction/problem
 */
public class JavaIDArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            int val = scan.nextInt();
            a[i]=val;
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
