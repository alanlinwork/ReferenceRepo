import java.io.*;
import java.util.*;
 
class CollectionObjectStorage {
   
    public static void main(String[] args)
    {
        // Instantiate an object of HashSet
        HashSet<ArrayList> set = new HashSet<>();
 
        // create ArrayList list1
        ArrayList<Integer> list1 = new ArrayList<>();
 
        // create ArrayList list2
        ArrayList<Integer> list2 = new ArrayList<>();
 
        // Add elements using add method
        list1.add(1);
        list1.add(2);
        list2.add(1);
        list2.add(2);
        set.add(list1);
        set.add(list2);
 
        // print the set size to understand the
        // internal storage of ArrayList in Set
        System.out.println(set.size());
    }
}



        // Adding elements into HashSet
        // using add() method
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
 
        // Adding duplicate elements
        h.add("India");
 
        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                           + h.contains("India"));
 
        // Removing items from HashSet
        // using remove() method
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                           + h);
 
        // Display message
        System.out.println("Iterating over list:");
 
        // Iterating over hashSet items
        Iterator<String> i = h.iterator();
 
        // Holds true till there is single element remaining
        while (i.hasNext())
 
            // Iterating over elements
            // using next() method
            System.out.println(i.next());
    }
}