package Exercitii;

public class Palindorm {
    public static void main(String[] args)
    {
        String palindorm = "Rotator";

        for(int i=0; i< palindorm.length(); i++) {
            if (palindorm.charAt(i) != palindorm.charAt(palindorm.length() - i-1)) {
                System.out.println("Nu este palidrom" + palindorm.charAt(i) + "!=" + palindorm.charAt(palindorm.length() - i-1) );
                break;
            }
        }
    }
}
