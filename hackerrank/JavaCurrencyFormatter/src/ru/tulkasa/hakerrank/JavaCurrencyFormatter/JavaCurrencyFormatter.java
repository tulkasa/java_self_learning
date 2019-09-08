package ru.tulkasa.hakerrank.JavaCurrencyFormatter;
import java.util.*;
import java.text.*;
/*
https://www.hackerrank.com/challenges/java-currency-formatter/problem
 */
public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat formatUS;
        NumberFormat formatINDIA;
        NumberFormat formatCHINA;
        NumberFormat formatFRANCE;
        formatUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us=formatUS.format(payment);
        formatINDIA = NumberFormat.getCurrencyInstance(new java.util.Locale("en","in"));
        String india=formatINDIA.format(payment);
        formatCHINA = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=formatCHINA.format(payment);
        formatFRANCE = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=formatFRANCE.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
