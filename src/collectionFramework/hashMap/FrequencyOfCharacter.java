package src.collectionFramework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    static void frequency(String str) {

        HashMap<Character, Integer> hashMap = new HashMap<>();

        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (hashMap.containsKey(charArr[i])) {

                int value = hashMap.get(charArr[i]);

                hashMap.replace(charArr[i], value + 1);

            } else {
                hashMap.put(charArr[i], 1);
            }

        }


        for(Map.Entry<Character,Integer> map : hashMap.entrySet()){
            System.out.println("frequency of "+map.getKey()+" = "+map.getValue());
        }


    }

    public static void main(String[] args) {

        String str = "aaabbbccsddddeeffddffgsggssvgaccgsgsgsgsg";

        frequency(str);

    }
}
