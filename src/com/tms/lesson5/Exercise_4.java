package com.tms.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив. Выведите на консоль диагонали массива.
 */

public class Exercise_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array ");

        System.out.print("a: ");
        int a = scanner.nextInt();

        System.out.print("b: ");
        int b = scanner.nextInt();

        int[][] array = new int[a][b];

        System.out.print("Source array");

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                array[i][j] = new Random().nextInt(9);
                System.out.print(array[i][j] + " ");
            }
        }

        System.out.print("\nArray diagonal");

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                if (j == i) {
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
        }

    }
}
