package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1");

        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        System.out.println("Задание 2");

        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("Задание 3");

        for (int i = 0; i <= 17; i ++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Задание 4");

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }

        System.out.println("Задание 5");

        for (int year = 1904; year <= 2096; year++){
        if ((year % 4 == 0) && year % 100 != 0 || (year % 400 == 0)) {
            System.out.println(year);
            }
        }

        System.out.println("Задание 6");

        for (int i = 0; i <= 98; i+=7){
            System.out.println(i);
        }

        System.out.println("Задание 7");

        for (int i = 1; i <=1000; i *= 2){
            System.out.println(i);
        }

        System.out.println("Задание 8");
        int stock = 29000;
        int sum = 0;
        for (int i = 1; i <= 12; i++){
            sum = sum + stock;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }


        System.out.println("Задание 9");

        int stock1 = 29000;
        int sum1 = 0;
        for (int i = 1; i <= 12; i++){
            sum1 = sum1 + stock1/100;
            sum1 = sum1 + stock1;
            System.out.println(sum1);
        }

        System.out.println("Задание 10");

        int multiplier = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println(multiplier + " * " + i + " = " + multiplier * i);
        }

    }
}
