package com.lab1;

import java.util.Scanner;
import java.util.Random;

public class Main {

    /**
     * Даны натуральные числа х и у.
     * Вычислить произведение х · у, используя лишь оператор сложения.
     * Задачу решить двумя способами.
     */

    static void task47() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 2 целых числа:");
        byte x = scan.nextByte();
        byte y = scan.nextByte();
        short startValue_x = x, startValue_y = y;
        for (byte a = 1; a < y; a++) {
            x += startValue_x;
        }
        for (byte a = 1; a < startValue_x; a++) {
            y += startValue_y;
        }
        System.out.println(startValue_x + "*" + startValue_y + "=" + x);
        System.out.println(startValue_y + "*" + startValue_x + "=" + y);
    }

    /**
     * Вычислить сумму 1! + 2! + 3! + ... + n!
     * (значение n вводится с клавиатуры; 1 < n ≤ 10).
     */

    static void task72() {
        Scanner scan = new Scanner(System.in);
        byte x = 100;
        int factorial = 1, amount = 0;
        while (x <= 1 || x > 10) {
            System.out.print("Введите число от 1 до 10:");
            x = scan.nextByte();
        }
        for (byte a = 1; a < x + 1; a++) {
            while (a == a) {
                factorial *= a;
                amount += factorial;
                break;
            }
        }
        System.out.println(amount);
    }

    /**
     * Известны результаты двух спортсменов-пятиборцев в каждом из пяти видов спорта в баллах.
     * Определить сумму баллов, полученных каждым спортсменом.
     */

    static void task97() {
        byte totalFirst = 0, totalSecond = 0;
        System.out.println("Results table.\n_____________________________________\n|First sportsman |\tSecond sportsman|");
        for (byte x = 0; x < 5; x++) {
            Random rand = new Random();
            int first = 1 + Math.round(rand.nextInt(10));
            System.out.print("|       " + first + "\t     |\t\t\t");
            totalFirst += first;
            int second = 1 + Math.round(rand.nextInt(10));
            System.out.println(second + "\t\t|");
            totalSecond += second;
        }
        System.out.println("-------------------------------------");
        System.out.println("Total results.\nFirst sportsman - " + totalFirst + "\nSecond sportsman - " + totalSecond);
    }

    /**
     * Составить программу, которая находит
     * наибольшее значение отношения трёхзначного числа к сумме его цифр.
     */

    static void task122() {
        int first, second, third;
        float biggestDivide = 0f, divide = 0f;
        for (short number = 100; number < 1000; number++) {
            first = number % 10;
            second = (number % 100 - first) / 10;
            third = (number - first - (10 * second)) / 100;
            divide = number / (first + second + third);
            if (divide > biggestDivide) {
                biggestDivide = divide;
            }
        }
        System.out.println(biggestDivide);
    }

    /**
     * Задано уравнение 11х3 – 13у3 + 17z3 – 4503 = 0.
     * Определить, имеет ли оно решение в целых числах.
     * Если имеет, то сколько их, и чему они равны.
     */

    static void task147() {
        System.out.println("11*x^3-13*y^3+17*z^3-4503=0");
        for (byte x = 0; x < 10; x++) {
            for (byte y = 0; y < 10; y++) {
                for (byte z = 0; z < 10; z++) {
                    if (11 * x * x * x - 13 * y * y * y + 17 * z * z * z - 4503 == 0) {
                        System.out.println("x=" + x + " y=" + y + " z=" + z);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        //task47();
        task72();
        //task97();
        //task122();
        //task147();
    }
}