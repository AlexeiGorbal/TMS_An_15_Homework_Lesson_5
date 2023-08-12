package com.tms.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создайте двумерный массив целых чисел. Отсортируйте элементы в
 * строках двумерного массива по возрастанию.
 */

public class Exercise_5 {
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
                array[i][j] = new Random().nextInt(20);
                System.out.print(array[i][j] + " ");
            }
        }

        int[] arrayTwo = new int[a * b];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                arrayTwo[k++] = array[i][j];
            }
        }

        System.out.println("\n" + Arrays.toString(arrayTwo));

        Arrays.sort(arrayTwo);

        System.out.println("\n" + Arrays.toString(arrayTwo));

        int j = a;

        for (int i = 0; i < arrayTwo.length; i++) {
            if (i < j) {
                System.out.print(arrayTwo[i] + " ");
            } else {
                System.out.print("\n"+arrayTwo[i] + " ");
                j += a;
            }
        }

    }
}
