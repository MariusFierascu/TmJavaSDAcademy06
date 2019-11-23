package Exercitii;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] array = new int[]{
                rnd.nextInt(9),
                rnd.nextInt(7),
                rnd.nextInt(6),
                rnd.nextInt(3),
                rnd.nextInt(7),
        };
        System.out.println(Arrays.toString(array));
        boolean sorted = true;
        while (!sorted) {
            sorted = true;
            for (int i = 0; 1 < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
