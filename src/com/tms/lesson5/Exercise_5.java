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

        System.out.println("Source array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new Random().nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[] arrayTwo = new int[b];

        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            int p = 0;
            for (int j = 0; j < array[i].length; j++) {
                arrayTwo[p++] = array[i][j];
            }
            Arrays.sort(arrayTwo);
            for (int k = 0; k < arrayTwo.length; k++) {
                System.out.print(arrayTwo[k] + " ");
            }
            System.out.println();
        }
    }
}
