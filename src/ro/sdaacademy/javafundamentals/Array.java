package ro.sdaacademy.javafundamentals;

public class Array {
    public static void main(String[] args) {

    int[] array;
    array = initArray(100);
    printArray(array); }


    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Metoda initArray imi intoarce un Array cu primele limit numere divizibile cu 11
     * @param limit reprezinta cate numere sa imi contina arrayul
     * @return un array cu primele 100 de numere divizibile cu 11
     */
    private static int[] initArray(int limit) {
        int [] array = new int[limit];
        int count = 0;
        for(int i = 0; count < limit; i++) {
            if (i % 11 == 0) {
                array[count++] = i;
            }
        }
        return array;
    }
}