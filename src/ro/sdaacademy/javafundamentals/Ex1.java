package ro.sdaacademy.javafundamentals;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        EX1();
        Ex2();
    }

    private static void Ex2() {
        Scanner in = new Scanner(System.in);
        int nr1 = in.nextInt();
        System.out.println("printed nr1 is:" + nr1);
        int nr2 = in.nextInt();
        System.out.println("printed nr2 is:" + nr2);
        int i;
        for (i=1; i!=nr2; i=i+nr1) {
            System.out.println( i );
        }
    }

    private static void EX1() {
        int i;
        for (i=0; i<=1000; i= i+5) {
            if (i == 5 || i == 55 || i == 555 || i==1000) {
                System.out.println( i );
            }
        }
    }
}