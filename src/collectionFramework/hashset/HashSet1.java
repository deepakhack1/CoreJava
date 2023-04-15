package src.collectionFramework.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        System.out.println(hashSet);

        hashSet.add(2);  //It doesn't allow duplicate element

        System.out.println(hashSet);

        System.out.println(hashSet.size());


        System.out.println(hashSet.isEmpty());

        System.out.println(hashSet.contains(Integer.valueOf(5)));

         Iterator<Integer> iterator = hashSet.iterator();

         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

         for(Integer  val : hashSet){
             System.out.println(val);
         }
         hashSet.remove(Integer.valueOf(2));
        System.out.println(hashSet);

        Object[] objects =hashSet.toArray();

        for(Object object : objects){
            Integer i = (Integer)object;
            System.out.println(i);
        }

         int i = hashSet.hashCode();
        System.out.println(i);




    }

}
