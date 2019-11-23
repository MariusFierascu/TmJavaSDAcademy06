package Exercitii;

import java.util.Scanner;

public class MatriceLELELE {
    public static void main(String[] args)
    {
        String [] arrayOfString = new String[5];

        Scanner in = new Scanner(System.in);

        for(int i=0; i<arrayOfString.length; i++){
            System.out.print("arrayOfString[" + i + "]=");
            arrayOfString[i]=in.nextLine();
            System.out.println("--");
        }

        /* using enchange for write the array
        format : (x,x,x,x,x)
         */
        System.out.print("(" );
        for (String ss : arrayOfString)
        {
            if(ss.equals(arrayOfString[4])) {
                System.out.print(ss);
            }
            else {
                System.out.print(ss + ",");
            }
        }

        System.out.print(")" );

    }
}
