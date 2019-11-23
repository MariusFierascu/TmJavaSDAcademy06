package ro.sdaacademy.javafundamentals;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
        System.out.println("Read first number: ");
    int n=Integer.parseInt(in.nextLine());
        System.out.println("Read second number: ");
    int m=Integer.parseInt(in.nextLine());
        while(n<0 || m<0){
        System.out.print("Read first number: ");
        n=Integer.parseInt(in.nextLine());
        System.out.print("Read second number: ");
        m=Integer.parseInt(in.nextLine());
    }
    afisare(n, m);
}
    private static void afisare(int n, int m) {
        long x = System.currentTimeMillis();
        for(int i=1;i!=m;i=i+n){
            System.out.print(i+" ");
            if(System.currentTimeMillis()-x > 10000){
                break;
            }
        }
    }


}
