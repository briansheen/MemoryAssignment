package com.example;

import java.util.Scanner;

public class Main {
    private static int input;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("FACTORIAL/FIBONACCI CALCULATOR!");
        System.out.print("input an integer: ");
        while (scanner.hasNext()) {
            input = scanner.nextInt();
            System.out.println(input + " factorial recursive is: " + factorialRecursive(input));
            System.out.println(input + " factorial loop is: " + factorialLoop(input));
            System.out.println("position " + input + " in fibonacci sequence recursive is: " + fibonacciRecursive(input));
            System.out.println("position " + input + " in fibonacci sequence loop is: " + fibonacciLoop(input));
            System.out.print("input an integer: ");
        }
    }

    public static int factorialRecursive(int x) {
        while (x > 1) {
            return x * factorialRecursive(x - 1);
        }
        return x;
    }

    public static int factorialLoop(int x) {
        int op1 = x;
        int op2 = 0;
        for (int i = x; i > 1; --i) {
            op2 = i - 1;
            op1 = op1 * op2;
        }
        return op1;
    }

    public static int fibonacciRecursive(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fibonacciRecursive(x - 1) + fibonacciRecursive(x - 2);
    }

    public static int fibonacciLoop(int x) {
        int op1 = 0;
        int op2 = 1;
        int sum = 0;
        if (x == 0) {
            return 0;
        }
        if (x == 1 || x == 2) {
            return 1;
        }
        for (int i = 0; i < x - 1; ++i) {
            sum = op1 + op2;
            op1 = op2;
            op2 = sum;
        }
        return sum;
    }
}
