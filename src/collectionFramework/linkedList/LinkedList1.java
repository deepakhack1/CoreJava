package src.collectionFramework.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Deepak");
        linkedList.add("Surya");

        System.out.println(linkedList);

        Iterator iterator = linkedList.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        for(String str : linkedList){
            System.out.println(str);
        }

        LinkedList<String> linkedList1 = new LinkedList<>();

        linkedList1.add("1");
        linkedList1.add("2");

        System.out.println(linkedList1);
        linkedList.addAll(linkedList1);

        System.out.println(linkedList);

        linkedList.add(2,"SAI");

        System.out.println(linkedList);

         String remove = linkedList.remove(1);

        System.out.println(remove);

        System.out.println(linkedList);

        linkedList.add("Surya");

        System.out.println(linkedList);

        linkedList.addFirst("Surya");

        System.out.println(linkedList);

        linkedList.remove("Surya");

        System.out.println(linkedList);

         String poll = linkedList.poll();

        System.out.println(poll);

        System.out.println(linkedList);

         String peek = linkedList.peek();

        System.out.println(peek);

         boolean empty = linkedList.isEmpty();

        System.out.println(empty);

        System.out.println(linkedList.indexOf("Surya"));

        System.out.println(linkedList.contains("SAI"));

        System.out.println(linkedList.contains("Deepak"));

         ListIterator<String> stringListIterator = linkedList.listIterator();

         while (stringListIterator.hasNext()){
             System.out.println(stringListIterator.next());
          //   System.out.println(stringListIterator.previous());  //make a infinite loop
         }

         linkedList1.clear();

         linkedList.push("Deepak");

        System.out.println(linkedList);
    }

}
