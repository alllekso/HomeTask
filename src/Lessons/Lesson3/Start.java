//Создать новый проект/класс.
//
//        Создать метод createArrayDialog, который в диалоговом режиме
//        запрашивает размер массива, все его элементы и возвращает
//        созданный числовой массив
//
//        Создать метод sum, который вычисляет сумму элементов массива
//
//        Создать метод max, который определяет максимальный элемент
//
//        Создать метод countEven, который вычисляет сумму четных элементов
//        массива
//
//        Создать метод printArray, который выводит массив на консоль
//
//        Создать метод printReport, который принимает в качестве аргументов
//        размер массива, сумму, макс, кол-во четных элементов и выводит
//        отчет на консоль:
//
//        Размер: 3
//
//        Сумма: 18
//
//        Максимальный: 10
//
//        Кол-во четных: 2
//
//        Продемонстрировать работу программы (в методe main не должно быть
//        другого кода, кроме вызовов созданных методов)

package Lessons.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    static int[] array = createArrayDialog();

    public static void main(String[] args) {
        printArray(array);
        System.out.println(sum(array));
        System.out.println(max(array));
        System.out.println(countEven(array));
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
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

    public static int max(int[] array) {
        Arrays.sort(array);
        int maxID = array[array.length - 1];
        System.out.print("Максимальное число массива: ");
        return maxID;
    }

    private static int countEven(int[] array) {
        int summaChetnix = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                summaChetnix = summaChetnix + array[i];
            }
        }
        System.out.print("Сумма чётных чисел массива: ");
        return summaChetnix;

    }
}
