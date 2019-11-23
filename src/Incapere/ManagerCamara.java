package Incapere;

import java.util.Scanner;

public class ManagerCamara {

    private static Camara camara = new Camara(2);

    public static void main(String[] args) {

        Borcan borcan = new Borcan();
        borcan.setContinut("Castraveti");
        Sticla sticla = new Sticla();
        sticla.setContinut("Sirop Mure");

        camara.adauga(borcan);
        camara.adauga(sticla);


        Scanner in = new Scanner(System.in);
        String opt;

        do {
            System.out.println("1.Afisare camara");
            System.out.println("2.Adauga");
            System.out.println("3.Extrage");
            System.out.println("4.Exit");
            System.out.println("Opt:");
            opt = in.nextLine();

            switch (opt) {
                case "1":
                    afisareCamara();
                    break;
                default:
                    System.out.println("Opt invalida reintroduceti");
            }

        } while (!"4".equals(opt));
    }

    private static void afisareCamara() {
        camara.afisare();

    }
}