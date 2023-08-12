package com.tms.lesson5;

import java.util.Random;

/**
 * Умножение двух матриц
 * Создайте два массива целых чисел размером 3х3 (две матрицы).
 * Напишите программу для умножения двух матриц.
 * Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
 * Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
 * Ожидаемый результат: 1 2 3 1 1 1 0 0 0
 */

public class Exercise_2 {
    public static void main(String[] args) {
        int[][] arrayOne = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrayTwo = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};

        int c = 0, sum = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int k = 0; k < arrayOne.length; k++) {
                for (int j = 0; j < arrayOne.length; j++) {
                    c += arrayOne[i][j] * arrayTwo[j][k];
                    sum += c;
                    c = 0;
                }
                System.out.print(sum + " ");
                sum = 0;
            }
        }
    }
}