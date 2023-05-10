package src.collectionFramework.hashMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

    public static void main(String[] args) {

        TreeMap<Character,Integer> treeMap = new TreeMap<>();

        treeMap.put('a',1);
        treeMap.put('z',2);
        treeMap.put('x',3);

       // treeMap.put(null,5);  //Doesn't contain null key

        for (Map.Entry<Character,Integer> map : treeMap.entrySet()){
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

    }

}
