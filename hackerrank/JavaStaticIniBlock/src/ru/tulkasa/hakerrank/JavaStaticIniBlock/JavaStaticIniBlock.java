package ru.tulkasa.hakerrank.JavaStaticIniBlock;

/*
https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class JavaStaticIniBlock {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc.nextInt();
    static boolean flag;
    static {
        try {
            if (B > 0 && H > 0) {
                flag = true;
            } else {
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
