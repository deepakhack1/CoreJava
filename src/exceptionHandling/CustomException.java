package src.exceptionHandling;


import java.util.Scanner;
class InvalidAgeException extends Exception{

    InvalidAgeException(String s) {
        super(s);
    }
}
public class CustomException {
    static void validate(int age) throws InvalidAgeException {

        if(age < 18)
            throw new InvalidAgeException("age should be greater than 18");
        else
            System.out.println("eligible to vote");

    }
    public static void main(String[] args) {

        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        try{
            validate(age);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
