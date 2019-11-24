package ro.sdaacademy.javafundamentals;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        int optiune;
        do {
            System.out.println("1. Write a Java program to sum values of an array. Read the size and read the numbers\n" +
                    "2. Write a Java program to calculate the average value of array elements\n\n" +
                    "3. Write a Java program to remove a specific element from an array. Also change the size of the array\n" +
                    "4. Write a Java program to insert an element (specific position) into an array\n" +
                    "5. Write a Java program to find the second largest element in an array\n" +
                    "6. Write a Java program to find the number of even and odd integers in a given array of integers\n" +
                    "7. (pct.J) Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter.\n" +
                    "        0. Exit\"\n");
            System.out.print("Please select an option:");
            optiune = Integer.parseInt(first.next());

            switch (optiune) {
                case 1:
                    Punct1(first);
                    break;
                case 2:
                    Punct2(first);
                    break;
                case 3:
                    Punct3(first);
                    break;
                case 4:
                    Punct4(first);
                    break;
                case 5:
                    Punct5(first);
                case 6:
                    Punct6(first);
                case 7:
                    Punct7(first);
            }

        }
        while (optiune != 0);

    }

    public static void Punct1(Scanner scan) {


        System.out.println("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);

        System.out.println("Suma elementelor din array: " + sumArray(array));
    }

    public static void Punct2(Scanner scan) {

        // Write a Java program to calculate the average value of array elements

        System.out.println("Citeste dimensiunea! ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        double medie = sumArray(array) / dim;
        System.out.println(medie);

    }

    public static void Punct3(Scanner in) {

        // Write a Java program to remove a specific element from an array. Also change the size of the array

        System.out.println("Dati dimensiunea: ");
        int dim = in.nextInt();
        int[] array = readArray(in, dim);
        System.out.println("Dimensiunea initiala este: " + array.length);
        printArray(array);
        System.out.println("Dati indexul elementului: ");
        int index = in.nextInt();
        array = extractPosition(array, index);
        System.out.println("Dimensiunea finala: " + array.length);
        printArray(array);
    }

    public static int[] readArray(Scanner scan2, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("array[" + (i + 1) + "]=");
            array[i] = scan2.nextInt();
        }
        return array;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public static int[] extractPosition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            } else {
                newArray[count] = array[i];
                count++;
            }

        }
        return newArray;
    }

    public static void Punct4(Scanner in) {

        // Write a Java program to insert an element (specific position) into an array

        System.out.println("Dati dimensiunea(pct4): ");
        int dim = in.nextInt();
        int[] array = readArray(in, dim);
        System.out.println("Dimensiunea initiala este: " + array.length);
        printArray(array);
        System.out.println();
        System.out.println("Dati indexul elementului: ");
        int index = in.nextInt();
        System.out.println("Dati valoarea: ");
        int value = in.nextInt();
        array = addPosition(array, index, value);
        System.out.println("Dimensiunea finala: " + array.length);
        System.out.println();
        printArray(array);
    }

    public static int[] addPosition(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[k] = value;
                k++;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    public static int largestNumber(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int[] extractElement(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                continue;
            } else {
                newArray[count] = array[i];
                count++;
            }

        }
        return newArray;
    }


    public static void Punct5(Scanner scan) {

        //  Write a Java program to insert an element (specific position) into an array

        System.out.println("Dati dimensiunea(pct5): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Al doilea maxim din array: ");
        System.out.println(largestNumber(extractElement(array, largestNumber(array))));

    }

    public static int countEven(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even++;
            }
        }
        return even;
    }


    public static int countOdd(int[] array) {
        return array.length - countEven(array);
    }

    public static void Punct6(Scanner scan) {

        //Write a Java program to find the number of even and odd integers in a given array of integers

        System.out.println("Dati dimensiunea(pct6): ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Numere pare: " + countEven(array));
        System.out.println("Numere impare: " + countOdd(array));
    }

    public static void Punct7(Scanner input) {

        //Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter.

        System.out.println("Citim Lungimea: ");
        int lungime = input.nextInt();
        System.out.println("Citim latimea: ");
        int latime = input.nextInt();

        for (int i = 0; i < latime; i++) {
            if (i == 0 || i == latime-1){
                for (int j = 0; j < lungime; j++) {
                    System.out.print("X");
                }
            }
            else {
                for (int j = 0; j < lungime; j++) {
                    if (j == 0 || j == lungime - 1) {
                        System.out.print("X");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


}