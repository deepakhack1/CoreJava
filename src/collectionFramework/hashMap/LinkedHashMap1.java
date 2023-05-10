package src.collectionFramework.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

    public static void main(String[] args) {

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1,1);
        linkedHashMap.put(2,1);
        linkedHashMap.put(3,1);
        linkedHashMap.put(null,1);
        linkedHashMap.put(null,2);
        linkedHashMap.put(5,null);
        linkedHashMap.put(6,null);

        for(Map.Entry<Integer,Integer> map : linkedHashMap.entrySet()){

            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

    }
}
