package Borcaniada;

public class Camara {
    public static void main(String[] args) {
        Borcan borcan1 = new Borcan("Castraveti");
        System.out.println(borcan1.getContinut());
        System.out.println(borcan1.totalBorcane);


        Borcan borcan2 = new Borcan("Castraveti");
        System.out.println(borcan2.totalBorcane);
        System.out.println(borcan1.totalBorcane);
        System.out.println(Borcan.totalBorcane--);
        System.out.println(borcan1.totalBorcane);
    }
}
