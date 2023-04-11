package src.collectionFramework;

import java.util.*;

public class ArrayListTemp {

    public static void main(String[] args) {

        int a1 = 10; //primitive data type
         Integer integer = Integer.valueOf(a1);  //Object


        Integer a = 10;
        // int -> Integer , float -> Float , boolean -> Boolean , char -> Character ,byte --> Byte

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);

        final Integer remove = arrayList.remove(1);
        System.out.println(remove);  //2

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(7);
        arrayList1.add(8);


        arrayList.addAll(arrayList1);

        System.out.println(arrayList);  // [1,4,7,8]


        final boolean remove1 = arrayList.removeAll(arrayList1);

        System.out.println(remove1);  //true

        System.out.println(arrayList);  //[1,4]

        final boolean contains = arrayList.contains(4);

        System.out.println(contains); //true

        arrayList.add(2);

        System.out.println(arrayList); //[1,4,2]

        Collections.sort(arrayList);

        Collections.reverse(arrayList);  //[4,2,1]

        System.out.println(arrayList); //[1,2,4]

        //Iterate

        //for loop
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        //for(datatype variableName : fromwhichcollection you are taking)

        //for - each loop
        for(Integer list1 : arrayList){

            System.out.println(list1);
        }

        //Iterator

        final Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(arrayList.size());  //3

        arrayList.ensureCapacity(5);

       // current capacity + (current capacity /2)  == 16 + 16/2 = 24 .....,, 24 + 24/2 = 36 .. so on

        ArrayList<Integer> arrayList2 = new ArrayList<>(3);

        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(8);

        System.out.println(arrayList2);  //[6,7,8]

        arrayList2.add(9);

        //3 + 3/2 = 3+1 = 4

        arrayList2.add(10);

        //4 + 4/2 = 4+2 = 6

        System.out.println(arrayList2); //[6,7,8,9,10]



        final boolean empty = arrayList.isEmpty();
        System.out.println(empty); // false

        ArrayList<String> arrayList3 = new ArrayList<>();
        final boolean empty1 = arrayList3.isEmpty();
        System.out.println(empty1); //True

        arrayList2.set(1,11);

        System.out.println(arrayList2); //[6,11,8,9,10]

        final int indexNumber = arrayList2.indexOf(10);
        System.out.println(indexNumber); //4


        arrayList2.add(8);

        System.out.println(arrayList2); //[6,11,8,9,10,8]

        System.out.println(arrayList2.lastIndexOf(8));  //5

        Collections.reverse(arrayList2);

        System.out.println(arrayList2);  // [8, 10, 9, 8, 11, 6]


        final Iterator<Integer> iterator1 = arrayList2.iterator();

        while (iterator1.hasNext()){
         //   iterator1.remove(); can't remove this is fail-fast iterator
            System.out.println(iterator1.next());
        }

        final ListIterator<Integer> integerListIterator = arrayList2.listIterator();

        while (integerListIterator.hasNext()){
            System.out.println(integerListIterator.next());
           // System.out.println(integerListIterator.previous());
        }

     // arrayList to arrays
        final Object[] objects = arrayList2.toArray();


        //arrays to arrayList
        int arr[] = {1,2,3,4};
        final List<int[]> ints =Arrays.asList(arr);

        System.out.println(arrayList2);

        Set<Integer> set = new LinkedHashSet<>(arrayList2);

        System.out.println(set);

        ArrayList<Integer> arrayList4 = new ArrayList<>(set);

        Collections.sort(arrayList4);

        System.out.println(arrayList4);

        Collections.reverse(arrayList4);


    }

}
