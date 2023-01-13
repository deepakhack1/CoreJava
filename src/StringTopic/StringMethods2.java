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



//                String str = "Java Programming";  // source
//                char arr[] = new char[10];  // size 10   //destination
//                str.getChars(0, 4, arr, 0);
//                System.out.println(arr);   //Java(6 char space waste)

//        String str = "JavaProgramming";
//        String str1 = "Java";
//
//        System.out.println(str.compareTo(str1));
//        System.out.println(str1.compareTo(str));

        String str = "Java Programming";
        String str1 = "Programminggggg";

        if (str.regionMatches(5, str1, 0, 11))
            System.out.println("Same");



        }







}
