package Exercitii;

public class SelfExample {

    public static void main(String[] args) {
        String str = "Ana are mere";
        System.out.println(str.length());

        //  System.out.println(str.substring(4,7));
        System.out.println(str.substring(str.indexOf("are"),str.indexOf("are")+3));
        System.out.println(str.substring(str.indexOf("mere"),str.indexOf("mere")+4));

        System.out.println(str.replace("are", "avea"));
        System.out.println(str);

        String st1 = "aaaz";
        String st2 = new String("aaZa");
//        System.out.println(st1.compareTo(st2));

        int firstIndex = str.indexOf('e');
        int lastIndex = str.lastIndexOf('e');
        String subStr = str.substring(firstIndex +1 , lastIndex - 1);
        System.out.println(firstIndex+1 +  subStr.indexOf('e'));

        StringBuilder builder = new StringBuilder();
        builder.append("Ana ");
        builder.append("are ");
        builder.append("mere");

        System.out.println(builder);

        builder.replace(builder.indexOf("are"), builder.indexOf("are")+3, "avea" );
        System.out.println(builder);

        String s = null;
        s.length();



    }
}
