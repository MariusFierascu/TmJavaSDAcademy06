package Exercitii;

import java.util.Scanner;

public class SwitchArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x=");
        int x = in.nextInt();

        System.out.println("y=");
        int y = in.nextInt();

        int z = x;
        x=y;
        y=z;
    }
}
