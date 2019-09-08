package ru.tulkasa.hakerrank.JavaRegex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
/*
https://www.hackerrank.com/challenges/java-regex/problem
 */
public class JavaRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex {
    static String zeroTo255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    public static String pattern = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;

}

