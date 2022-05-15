package data_structuretasks;

import java.util.Collections;
import java.util.LinkedList;
public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
         names.add("Liam");
         names.add("Olivia");
         names.add("Henry");
         names.add("Charlotte");
         names.add("Felix");
         names.add("Axel");
        System.out.println ( "List:"+ names );
        Collections.reverse(names);
        System.out.println("List after reverse:" + names);
    }

}
