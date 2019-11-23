package Exercitii;

public class LoopsEX {
    public static void main(String[] args) {

        int x = 0;

        //while (x < 10)
        do {
            System.out.println(x);

            if (x == 5) {
                continue;
            }
            if (x == 3) {
                //break;
            }

            x++;
        }
        while (x < 10);
    }
}
