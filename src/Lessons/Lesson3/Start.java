package Lessons.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    static int[] array = createArrayDialog();

    public static void main(String[] args) {
        System.out.println(sum(array));

    }

    private static int[] createArrayDialog() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int a = scan.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите " + (i + 1) + "-й элемент массива: ");
            array[i] = scan.nextInt();
        }
        System.out.printf("Вы ввели массив из %d элементов: ", a);
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int sum(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        System.out.print("Сумма всех чисел массива: ");
        return summa;
    }

}