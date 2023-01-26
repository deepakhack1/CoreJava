package src.exceptionHandling;

public class MultipleTryBlock {

    public static void main(String[] args) {

        try {
            try{
                String s = null;
                System.out.println(s.length());
            }catch (NullPointerException e){
                System.out.println("null pointer");
            }
            try{
                int x = 10/0;
            }catch (ArithmeticException e){
                System.out.println("Arithmetic exception");
                int z = 10/0;
            }
        }
        catch (Exception e){
            System.out.println("exception");
            e.printStackTrace();
        }

    }

}
