package src;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        //5! = 5*4*3*2*1 = 1*2*3*4*5

        int value;
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();

        int ans = 1;

        if(value == 0){
            ans = 1;
        }

        for(int i=1;i<=value;i++){
            ans = ans*i;
        }

        System.out.println(ans);

    }

}
