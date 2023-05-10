package src.collectionFramework.hashMap;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatingNumber {

    static int firstRepeatNumberNonOptimized(int arr[]){

        for(int i=0;i< arr.length-1;i++){

            for (int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }

        }

        return -1;

    }

    static int firstRepeatNumberOptimized(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){

            if(set.contains(Integer.valueOf(arr[i]))){
                return arr[i];
            }

            else {
                set.add(arr[i]);
            }

        }

        return -1;

    }

    public static void main(String[] args) {

        int arr[] = {1,3,4,5,3,5};

        System.out.println(firstRepeatNumberNonOptimized(arr));

        System.out.println(firstRepeatNumberOptimized(arr));



    }
}
