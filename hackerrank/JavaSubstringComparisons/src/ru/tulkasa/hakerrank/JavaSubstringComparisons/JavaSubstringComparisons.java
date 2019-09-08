package ru.tulkasa.hakerrank.JavaSubstringComparisons;
import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/java-string-compare/problem
 */
public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n = s.length() - k;
        String[] arr = new String[n + 1];
        for (int i = 0; i <= s.length() - k; i++) {
            arr[i] = s.substring(i, i + k);
        }
        java.util.Arrays.sort(arr);
        smallest = arr[0];
        largest = arr[n];
        return smallest + "\n" + largest;
        //return arr[0] + "\n" + arr[n];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        //for(int i=0; i+k<=s.length();i++) {
        //    java.util.ArrayList<String> list = new java.util.ArrayList<String>();
        //    String tmp=s.substring(i,i+k);
        //    list.add(tmp);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
