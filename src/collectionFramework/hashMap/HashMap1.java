package src.collectionFramework.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"Deepak");
        hashMap.put(2,"Surya");
        hashMap.put(3,"Saai");
        hashMap.put(4,"Surya");
        hashMap.put(4,"Deepak");
        hashMap.put(1,"Aman");

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        System.out.println(entries);

        System.out.println(hashMap);

        for(Map.Entry<Integer,String> map1 : hashMap.entrySet()){

            System.out.println(map1.getKey() + " : "+ map1.getValue());
        }

         int size = hashMap.size();
        System.out.println(size);

         String val = hashMap.get(1);
        System.out.println(val);


    }

}
