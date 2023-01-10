package src.Loops;

public class ForLoop {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        //FOR LOOP

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }


        // Advanced For loop

        for(int arr1 : arr){
            System.out.println(arr1);
        }


    }

}

