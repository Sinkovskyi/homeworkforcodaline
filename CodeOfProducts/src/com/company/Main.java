package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.print("Введите трёхзначный код товара: ");

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        int codeOfProductsParseInt =  Integer.parseInt(str);

        if(codeOfProductsParseInt>=0 && codeOfProductsParseInt<300 ){
            System.out.print("Колбаска");
        }
        else if(codeOfProductsParseInt>=300 && codeOfProductsParseInt<600){
            System.out.print("Кифирчик");
        }
        else if(codeOfProductsParseInt>=600 && codeOfProductsParseInt<900){
            System.out.print("Мяско");
        }
        else if(codeOfProductsParseInt>=900 && codeOfProductsParseInt<1000){
            System.out.print("Печенюхи");
        }
        else{
            System.out.print("WTF");
        }

    }
}
