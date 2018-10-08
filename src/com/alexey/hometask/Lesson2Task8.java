//В переменной n хранится натуральное двузначное число.
// Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
package com.alexey.hometask;

import java.util.Scanner;

public class Lesson2Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите двузначное натуральное число:");
        int n = scan.nextInt();
        System.out.print("Cумма цифр двузначного числа равна: " + (n/10 + n%10));
    }
}
