//Реализовать программу ввода числа x с клавиатуры и вывода значения: x - 5%
package com.alexey.hometask;
import java.util.Scanner;

public class Lesson2Task4 {
    public static void main(String[] args) {
        char p = '%';
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.printf("5%s от числа %d = %.2f", p, x, x*0.95);
    }
}
