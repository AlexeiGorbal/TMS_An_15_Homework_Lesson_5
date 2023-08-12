package com.tms.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив целых чисел. Выведите на консоль сумму
 * всех элементов массива.
 */

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array ");

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        int sum = 0;

        int[][] array = new int[a][b];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = new Random().nextInt(50);
                sum += array[i][j];
            }
        }

        System.out.println(Arrays.deepToString(array));

        System.out.println("Sum all elements of the array.: " + sum);
    }
}
