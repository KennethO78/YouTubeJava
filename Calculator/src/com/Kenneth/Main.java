package com.Kenneth;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cal = new Scanner(System.in);
        double  fnum, snum, answer;
            //able to enter a number
        System.out.println("Enter first number: ");
        fnum = cal.nextDouble();
            //able to enter a number
        System.out.println("Enter your second number: ");
        snum = cal.nextDouble();
        // the two numbers will add here
        answer = fnum + snum;
        System.out.println(answer);
    }
}
