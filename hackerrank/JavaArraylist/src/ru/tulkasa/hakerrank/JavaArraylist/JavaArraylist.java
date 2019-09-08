package ru.tulkasa.hakerrank.JavaArraylist;
import java.io.*;
import java.util.*;
/*
https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class JavaArraylist {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> listList = new ArrayList<ArrayList<Integer>>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < m; j++) {
                list.add(sc.nextInt());
            }
            listList.add(list);
        }

        int q = sc.nextInt();
        for (int k = 0; k < q; k++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            try {
                int v = listList.get(r - 1).get(c - 1);
                System.out.println(v);
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        sc.close();
    }
}
