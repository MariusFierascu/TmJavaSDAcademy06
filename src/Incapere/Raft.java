package Incapere;

public class Raft {
    private ObiectulDinCamara[] obiecte = new ObiectulDinCamara[10];

    public void afisare() {
        System.out.print("(");
        for (int i = 0; i < obiecte.length; i++) {
            if (obiecte[i] != null) {
                obiecte[i].afisare();
            } else {
                System.out.print("_");
            }
            if (i < obiecte.length - 1)
                System.out.print(",");
        }
        System.out.println(")");
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (ObiectulDinCamara obj : obiecte)
            empty = empty && (obj == null);
        return empty;
    }

    public boolean adauga(ObiectulDinCamara obiect) {
        for (int i = 0; i < obiecte.length; i++)
            if (obiecte[i] == null) {
                obiecte[i] = obiect;
                return true;
            }
        return false;
    }
}
