package com.company;

import java.util.Scanner;
import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //create array
        Scanner scan = new Scanner(System.in);
        System.out.print("ведите размер массива:");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];

        // use Only integer type for input bottom border of Array and top border of Array
        System.out.print("ведите нижнюю границу массива: ");
        int bottomBorderOfArray = scan.nextInt();
        System.out.print("ведите верхнюю границу массива: ");
        int topBorderOfArray = scan.nextInt();

        //initial summ of array
        int summ = 0;

        // main expression of our little program
        for (int i = 0; i < arr.length; i++) {
            if (bottomBorderOfArray >= 0 && topBorderOfArray > bottomBorderOfArray) {
                arr[i] = (int) (bottomBorderOfArray + Math.random() * ((topBorderOfArray + 1) - bottomBorderOfArray));
                summ = summ + arr[i];
            }
            else if (bottomBorderOfArray < 0 && topBorderOfArray < 0) {
                arr[i] = (int) ((bottomBorderOfArray - 1) + Math.random() * ((topBorderOfArray) - (bottomBorderOfArray - 1)));
                summ = summ + arr[i];

            }
            else if (bottomBorderOfArray < 0) {
                arr[i] = (int) ((bottomBorderOfArray - 1) + Math.random() * ((topBorderOfArray + 1) - (bottomBorderOfArray - 1)));
                summ = summ + arr[i];
            }
            else {
                System.out.println("Введите коректный диапазон массива");
                break;
            }
        }

        //magical transformation
        double a = (double)summ/arr.length;
        System.out.println("среднее арифметическое массива c округлением до сотых: "
                +  BigDecimal.valueOf(a).setScale(2,BigDecimal.ROUND_HALF_DOWN).doubleValue());
    }
}

