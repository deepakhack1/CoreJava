package src.StringTopic;

public class Temp1 {

    public static void main(String[] args) {

        //String Constant pool
        String str = "Surya";
        String str2 = "Surya1";
        if(str==str2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        //Heap
        String str1 = new String("Deepak");
        String str3 = new String("Deepak");
        if(str1==str3){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }



}
