package com.tms.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *  Создать трехмерный массив из целых чисел.
 * 	С помощью циклов "пройти" по всему массиву и увеличить каждый
 * 	элемент на заданное число. Пусть число, на которое будет
 * 	увеличиваться каждый элемент, задается из консоли.
 */


public class Exercise_0 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        System.out.print("One: ");
        int one = sc.nextInt();
        System.out.print("Two: ");
        int two = sc.nextInt();
        System.out.print("Three: ");
        int three = sc.nextInt();

        int[][][] array = new int[one][two][three];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = new Random().nextInt(10);
                }
            }
        }

        System.out.println(Arrays.deepToString(array));

        System.out.print("Enter the number you want to increase: ");
        int number=sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] += number;
                }
            }
        }

        System.out.println(Arrays.deepToString(array));

    }

}
