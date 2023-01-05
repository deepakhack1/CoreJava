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

        String s6 = "India is a good country";
        String s7 = s6.substring(6);
        String s8 = s6.substring(6,8);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = "Indiaia";
        int z = s9.indexOf('i',4);
        System.out.println(z);

        int z1 = s6.indexOf("good");
        System.out.println(z1);

        int z2 = s9.lastIndexOf('a');
        int z3 = s9.indexOf('a',5);

        System.out.println(z2);
        System.out.println(z3);








    }

}
