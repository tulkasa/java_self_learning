package ru.tulkasa.hakerrank.JavaExceptionHandling;
import java.io.*;
import java.util.*;
/*
https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */
public class JavaExceptionHandling {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } finally {
            sc.close();
        }
    }
}
