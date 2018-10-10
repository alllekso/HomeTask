//1) Напишите программу, которая:
//	- считывает строку
//	- выводит исходную строку
//	- выводит количество и список слов, которые начинаются на букву 'd'
package com.alexey.hometask.Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        printString(enterScan());
    }

    // Считываем строку
    private static String enterScan() {
        System.out.printf("Введите строку из 5 и более слов.%nМинимум одно слово должно начинаться на букву d: %n");
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    private static void printString(String str) {
        String[] array = str.split(" ");
        if (array.length < 5) {
            System.out.println("Введите 5 и более слов");
            printString(enterScan());
        } else {
            //Выводим исходную строку
            System.out.println("Вы ввели:" + str);
        }

        String finalResult = "";
        int count = 0;
        //Делаем выборку слов, начинающихся на определённую букву
        for (int i = 0; i < array.length; i++) {
            if (String.valueOf(array[i].charAt(0)).equals("d")) {
        //складываем в строку все слова, удовлетворяющие сортировке
                finalResult = finalResult + " " + array[i];
                count++;
            }
        }
        System.out.printf("Вы ввели %d слов, начинающихся на букву d. %n", count);
        System.out.println("Перечень слов на букву d: " + finalResult);
    }


}

