package src.StringTopic;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Surya";
        char ch[] = s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }

        byte[] b = s1.getBytes();
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

        String s2 = s1.toUpperCase();
        System.out.println(s2);  //SURYA

        String s3 = s1.toLowerCase();
        System.out.println(s3);  //surya


        String s4 = " ----------------India is a good------------ ";
        System.out.println(s4.length());  //44

        System.out.println(s4);

        String s5 = s4.trim();
        System.out.println(s5);








    }

}
