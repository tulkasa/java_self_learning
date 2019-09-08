package ru.tulkasa.hakerrank.JavaEndOfFile;

/*
https://www.hackerrank.com/challenges/java-end-of-file/problem
 */

import java.io.*;
import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int count = 1;

        while(s.hasNext()) {
            String ns = s.nextLine();
            System.out.println(count + " " + ns);
            count++;
        }
    }
}
