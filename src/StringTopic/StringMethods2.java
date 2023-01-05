package src.StringTopic;

public class StringMethods2 {

    public static void main(String[] args) {
        String s = String.valueOf(20.5);
        System.out.println(s);

        String s1 = "good";
        System.out.println(s1+" morning");
        s1 = s1+"morning";
        System.out.println(s1);

        String s2 = 10+30+s1 + 10 + 30;

        System.out.println(s2);

        String s4 = "Hello";
        String s3 = s4.concat(s1);
        System.out.println(s3);



    }



}
