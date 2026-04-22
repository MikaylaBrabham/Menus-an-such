package com.pluralsight;
import java.util.ArrayList;
//array list example

public class CollectionClassEx {
    public static void main(String[] args) {
        // resizable array
        // T = generic type give away

        //create the empty list
        ArrayList<String> kids = new ArrayList<>();

        //add 3 rugrats to the list
        kids.add("bob");
        kids.add("sally");
        kids.add("timmy");

        kids.set(1, "angelica");

        //print out the list
        System.out.println(kids);


        // loop over the list awith a traditional for loop
        for(int i = 0; 1 < kids.size(); i++){
            // use get() to get it by the index
            System.out.println(kids.get(i) );
        }

        //manipulate the list to make the names all uppercase
        kids.set(i, kids.get(i).toUpperCase());

        }
    // remove the middle child
       // kids.remove(index1);
        // use the for-each to loop over the list again
        int i = 1;
        for (String kid : kids){
            System.out.println(i + "." + kid);
            i++;


            // .size is the length of the list, return number of
            // set takes positions and changes the value at that position
        }

    }
}
