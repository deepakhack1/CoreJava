package src.collectionFramework;

import java.util.LinkedHashSet;

public class linkedHasSet {

    public static void main(String[] args) {

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Deepak");
        linkedHashSet.add("Surya");
        linkedHashSet.add("Sai");

        System.out.println(linkedHashSet);

        linkedHashSet.add("Deepak");

        linkedHashSet.add(null);

        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.size());
    }

}
