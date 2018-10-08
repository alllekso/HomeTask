//В переменной n хранится вещественное число с ненулевой дробной частью.
//	Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
package com.alexey.hometask.Lesson2;

import java.util.Scanner;

public class Lesson2Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        double q = scan.nextDouble();
        System.out.printf("Число округлено до %d", (int)Math.round(q));
    }
}
