package com.testpackage;

public class Main {

    public static void main(String[] args) {
        int digit = 6587676;
        int x = digit;
        int sum = 0;
        while (x != 0) {
            sum += x % 10;
            x = x / 10;
        }
        if (digit == 0) {
            System.out.println("Это число ноль!");
        } else {
            System.out.println("Сумма цифр числа " + digit + " равна " + sum);
        }
    }
}
