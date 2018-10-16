package Lessons.Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    static int[] array = createArrayDialog();

    public static void main(String[] args) {
        System.out.println(sum(array));
        System.out.println(sum2(array));
    }

    private static int sum(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        return summa;
    }

    private static int sum2(int[] array) {
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        return summa;
    }

    private static int[] createArrayDialog() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int array[] = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}