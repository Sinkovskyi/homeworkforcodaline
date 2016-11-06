package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.print("Введите любое число: ");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine().trim();

        int enteredNumber =  Integer.parseInt(str.replaceAll(" ",""));

        if(enteredNumber  % 2 == 0) {
            System.out.println("Число " + enteredNumber  + " - четное!");
        }
        else {
            System.out.println("Число " + enteredNumber  + " - нечетное!");
        }
    }
}
