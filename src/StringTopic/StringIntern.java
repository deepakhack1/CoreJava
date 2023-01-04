package src.StringTopic;

public class StringIntern {

    public static void main(String[] args) {

        String s1 = new String("Deepak");
        String s2 = s1.intern();

        String s3 = new String("Deepak");
        String s4 = s3.intern();

        if(s2==s4){
            System.out.println("true");
        }

    }



}
