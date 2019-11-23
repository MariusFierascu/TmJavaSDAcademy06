package Exercitii;

import java.util.Scanner;

public class Casete {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String ss = in.nextLine ();
        System.out.println ("You entered string " + ss);

    /*
    read from keyboard CNP
    verify digit and print
    Male/Female

    1digit of cnp:
    1,3,5 Male
    2,4,6 Female

     */
        switch (ss.charAt (0)) {
            case '1':
            case '5':
            case '3':
                System.out.println ("Male");
                break;
            case '4':
            case '6':
            case '2':

                System.out.println ("Female");
                break;
            default:
                System.out.println ("Nothing");
        }
    }
}
