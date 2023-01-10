package src.StringTopic.StringBufferExample;

public class Temp1 {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append(2);
        System.out.println(sb);

        String str = new String();
        String str2 = str.concat("2");
        System.out.println(str2);

//        StringBuffer sb1 = "deepak";  we can't do as we did in constant pool in strings

        System.out.println(sb.length());
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.length());  //5
        System.out.println(sb1.capacity()); // default capacity is 16 + 5(length ) === 21

        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer(5);
        System.out.println(sb3.capacity());
        sb3.append("helloGood");

        //(initialCapacity + 1 ) * 2 === (5+1)*2 = 12
        System.out.println(sb3.capacity());

        sb3.reverse();
        System.out.println(sb3);






    }

}
