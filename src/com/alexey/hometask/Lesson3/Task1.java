package com.alexey.hometask.Lesson3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str = inputString();
        printString(str);

        }

        public static String inputString() {
            System.out.println("Введите строку:");
            Scanner scan = new Scanner(System.in);
            String n = scan.nextLine();
            while (n.length() < 10) {
                System.out.println("Введите больше слов:");
                n = scan.nextLine();
            }
            return n;
        }
        public static void printString(String str) {
        System.out.println(str);
    }

    }
