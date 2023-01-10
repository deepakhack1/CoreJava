package src.StringTopic;

public class EqualsMethod {

    public static void main(String[] args) {

        EqualsMethod e1 = new EqualsMethod();
        EqualsMethod e2 = new EqualsMethod();

        if(e1.equals(e2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        String s1 = "Deepak";
        String s2 = new String("deepak");

        if(s1.equalsIgnoreCase(s2)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


        String s3 = "Hello";
        String s4 = "DelLo";

        int z = s3.compareTo(s4);
        System.out.println(z);

        int z1 = s3.compareToIgnoreCase(s4);
        System.out.println(z1);



        String s5 = "India is a good country good";
        String s6 = s5.replace(" ","-");
        System.out.println(s6);

        String s7 = s5.replace("good","best");
        System.out.println(s7);

        String s8 = "Not immutable";
        String s9 = new String("not immutable");
        boolean b = s8.contentEquals(s9);
        System.out.println(b);

        boolean retVal = s8.endsWith("Not");
        System.out.println(retVal);


        char ch[] ={'s','u','r','y','a'};
        String str = new String(ch);
        System.out.println(str);

        String str1 = String.valueOf(ch);
        System.out.println(str1);

        StringBuilder sb = new StringBuilder();
        for(char ch1 : ch){
            sb.append(ch1);
        }
        System.out.println(sb);





    }

}
