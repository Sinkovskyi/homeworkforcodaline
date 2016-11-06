package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.err.print("Введите факториал: ");
        Scanner scann = new Scanner(System.in);
        int number = scann.nextInt();

        int factorial = 1;

        if (number<0){
            throw new IllegalArgumentException("x должен быть больше или равен 0");
        }

        else if(number >= 0 && number < 12 ) {
            for (int i = 2; i <= number; i++) {
                factorial = factorial * i;
            }
            System.out.println(factorial);
        }

        else if (number >= 12 && number < 21) {

            long longFactorial = (long) (factorial);

            for (int i = 2; i <= number; i++) {
                longFactorial = (long) (longFactorial * i);
            }
            System.out.println(longFactorial);
        }

        else{

            BigInteger veryLongFactorial = BigInteger.ONE;

            for (int i = 1; i <= number; ++i){
                veryLongFactorial = veryLongFactorial.multiply(BigInteger.valueOf(i));
            }
            System.out.println(veryLongFactorial);
        }
    }
}
