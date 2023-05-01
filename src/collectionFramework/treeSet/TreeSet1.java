package src.collectionFramework.treeSet;

import java.util.*;

public class TreeSet1 {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(1);

        System.out.println(treeSet);


        TreeSet<String> treeSet1 = new TreeSet<>();

        //A-65 a-97 0-48 ' '-32

        treeSet1.add("5");  //5->53
        treeSet1.add("Surya");
        treeSet1.add("Deepak");
        treeSet1.add("deepak");  //d->100

        System.out.println(treeSet1);

         Iterator<String> iterator = treeSet1.iterator();
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }

        System.out.println(treeSet1.contains("5"));

        ArrayList<String> arrayList = new ArrayList<>(treeSet1);

        System.out.println(arrayList);

        Collections.reverse(arrayList);  //reverse the list

        System.out.println(arrayList);

         NavigableSet<String> strings = treeSet1.descendingSet();
        System.out.println(strings);

        System.out.println(treeSet1.remove("7"));


    }

}